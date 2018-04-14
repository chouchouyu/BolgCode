package android.cm.com.loginsdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HookUtils {
    private Context context;

    public HookUtils(Context context) {
        this.context = context;
        try {
            //根据变量名m获得字段
            Class<?> ActivityManagerNativecls = Class.forName("android.app.ActivityManagerNative");
            //设置字段可访问，即暴力反射
            Field gDefault = ActivityManagerNativecls.getDeclaredField("gDefault");
            //因为是静态变量  所以获取的到的是系统值  hook   伪hook
            gDefault.setAccessible(true);
            ////在那个对象上获取此字段的值
            Object defaltValue = gDefault.get(null);
            //----------- hook
            Class<?> SingletonClass = Class.forName("android.util.Singleton");
            Field mInstance = SingletonClass.getDeclaredField("mInstance");
            mInstance.setAccessible(true);
            Object iActivityManagerObject = mInstance.get(defaltValue);
            //---------创建自己的IActivityManger-动态代理 接口
            Class<?> IActivityManagerClass = Class.forName("android.app.IActivityManager");
            MyActivityManager myActivityManager = new MyActivityManager(iActivityManagerObject);
            Object sysActivityManager = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IActivityManagerClass}, myActivityManager);

            //替换新旧ActivityManger
            mInstance.set(defaltValue, sysActivityManager);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private class MyActivityManager implements InvocationHandler {
        private Object iActivityManagerObject;

        public MyActivityManager(Object iActivityManagerObject) {
            this.iActivityManagerObject = iActivityManagerObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("startActivity".equals(method.getName())) {
                Log.i("INFO", "-----------------startActivity--------------------------");
//瞒天过海
//                寻找传进来的intent并记录
                Intent intent = null;
                int index = 0;

                for (int i = 0; i < args.length; i++) {
//                    intent
                    Object arg = args[i];
                    if (arg instanceof Intent) {
                        intent = (Intent) args[i];
                        index = i;
                    }
                }
                //目的  ---载入acgtivity  将它还原
                Intent newIntent = new Intent();
                ComponentName componentName = new ComponentName(context, LoginActivity.class);
                newIntent.setComponent(componentName);
//                真实的意图 被我隐藏到了  键值对
                newIntent.putExtra("oldIntent", intent);
                args[index] = newIntent;
            }
            return method.invoke(iActivityManagerObject, args);
        }
    }
}
