package android.cm.com.loginsdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HookUtils {
    private Context context;

    public void hookStartActivity(Context context) {
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

    //还原Activity
    public void hookHookMh() {
        try {
            Class<?> forName = Class.forName("android.app.ActivityThread");
            Field currentActivityThreadField = forName.getDeclaredField("sCurrentActivityThread");
            currentActivityThreadField.setAccessible(true);
//            还原系统的ActivityTread   mH
            Object activityThreadObj = currentActivityThreadField.get(null);

            Field handlerField = forName.getDeclaredField("mH");
            handlerField.setAccessible(true);
//            hook点找到了
            Handler mH = (Handler) handlerField.get(activityThreadObj);

            Field callbackField = Handler.class.getDeclaredField("mCallback");

            callbackField.setAccessible(true);

            callbackField.set(mH, new ActivityMH(mH));

        } catch (
                ClassNotFoundException e)

        {
            e.printStackTrace();
        } catch (
                NoSuchFieldException e)

        {
            e.printStackTrace();
        } catch (
                IllegalAccessException e)

        {
            e.printStackTrace();
        }
    }

    class ActivityMH implements Handler.Callback {
        private Handler mH;

        public ActivityMH(Handler mH) {
            this.mH = mH;
        }

        @Override
        public boolean handleMessage(Message msg) {
            //LAUNCH_ACTIVITY ==100 即将要加载一个activity了
            if (msg.what == 100) {
//加工 --完  一定丢给系统  secondActivity  -hook->proxyActivity---hook->    secondeActivtiy
                handleLuachActivity(msg);
            }
//做了真正的跳转
            mH.handleMessage(msg);
            return true;
        }

        private void handleLuachActivity(Message msg) {
            //            还原
            Object obj = msg.obj;
            try {
                Field intentField = obj.getClass().getDeclaredField("intent");
                intentField.setAccessible(true);
                //  ProxyActivity   2
                Intent realyIntent = (Intent) intentField.get(obj);

//               sconedActivity  1
                Intent oldIntent = realyIntent.getParcelableExtra("oldIntent");
                SharedPreferences share = context.getSharedPreferences("david",
                        Context.MODE_PRIVATE);
                if (oldIntent != null) {
                    //代表之前的intent
                    if (share.getBoolean("login", false)) {
                        //不需要登录
//                      登录  还原  把原有的意图    放到realyIntent
                        realyIntent.setComponent(oldIntent.getComponent());
                    } else {
                        //跳转登录
                        ComponentName componentName = new ComponentName(context, LoginActivity.class);
                        realyIntent.putExtra("extraIntent", oldIntent.getComponent()
                                .getClassName());
                        realyIntent.setComponent(componentName);
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

