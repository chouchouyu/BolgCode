package com.cm.android.skin.core;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;

import java.lang.reflect.Method;
import java.util.Observable;

public class SkinManager extends Observable {


    private Application application;


    private static SkinManager instance;

    public static void init(Application application) {
        synchronized (SkinManager.class) {
            if (null == instance) {
                instance = new SkinManager(application);
            }
        }
    }

    public static SkinManager getInstance() {
        return instance;
    }

    public SkinManager(Application application) {
        this.application = application;
        //共享首选项 用于记录当前使用的皮肤
        SkinPreference.init(application);
        //资源管理类 用于从 app/皮肤 中加载资源
        SkinResources.init(application);
        //注册Activity生命周期回调
        application.registerActivityLifecycleCallbacks(new SkinActivityLifecycle());
        //加载皮肤
        loadSkin(SkinPreference.getInstance().getSkin());
    }

    /**
     * 加载皮肤包 并 更新
     *
     * @param path 皮肤路径 如果为空则使用默认皮肤
     */
    private void loadSkin(String path) {
        //还原默认皮肤包
        if (TextUtils.isEmpty(path)) {
            //记录使用默认皮肤
            SkinPreference.getInstance().setSkin("");
            //清空资源管理器 皮肤资源属性
            SkinResources.getInstance().reset();
        } else {
            try {
                //反射创建AssetManager 与 Resource
                AssetManager assetManager = AssetManager.class.newInstance();
                //资源路径设置 目录或压缩包
                Method addAssertPath = assetManager.getClass().getMethod("addAssertPath", String.
                        class);
                addAssertPath.setAccessible(true);
                addAssertPath.invoke(assetManager, path);

                Resources resources =application.getResources();
                //根据当前的显示与配置(横竖屏、语言等)创建Resources
                Resources skinResource = new Resources(assetManager, resources.getDisplayMetrics(),
                        resources.getConfiguration());
                //记录
                SkinPreference.getInstance().setSkin(path);
                //获取外部Apk(皮肤包) 包名
                PackageManager mPm = application.getPackageManager();
                PackageInfo info = mPm.getPackageArchiveInfo(path, PackageManager
                        .GET_ACTIVITIES);
                String packageName = info.packageName;
                SkinResources.getInstance().applySkin(skinResource, packageName);
                //保存当前使用的皮肤包

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //通知采集的View 更新皮肤
        //被观察者改变 通知所有观察者
        //应用皮肤包
        setChanged();
        //通知观察者
        notifyObservers();
    }


}
