package com.github.chouchouyu.eventbus;

import android.os.Handler;
import android.os.Looper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.github.chouchouyu.eventbus.ThreadMode.Async;

/**
 * Created by admin on 2018/6/20.
 */

public class Eventbus {

    private static Eventbus instance = new Eventbus();

    public static Eventbus getDefault() {
        return instance;
    }

    //总表
    private Map<Object, List<SubscribleMethod>> cacheMap;

    private final ExecutorService executorService;

    private final Handler handler;

    public Eventbus() {
        this.cacheMap = new HashMap<>();
        executorService = Executors.newCachedThreadPool();
        handler = new Handler(Looper.getMainLooper());
    }


    public void register(Object activity) {
        Class<?> clazz = activity.getClass();
        List<SubscribleMethod> list = cacheMap.get(activity);
        if (list == null) {
            list = getSubscribleMethods(activity);
            cacheMap.put(activity, list);
        }
    }

    private List<SubscribleMethod> getSubscribleMethods(Object activity) {
        List<SubscribleMethod> list = new ArrayList<>();
        Class clazz = activity.getClass();
        while (clazz != null) {
            String name = clazz.getName();
            if (name.startsWith("java.")
                    || name.startsWith("javax.")
                    || name.startsWith("android.")) {
                break;
            }
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                Subscribe subscribe = method.getAnnotation(Subscribe.class);
                if (subscribe == null) {
                    continue;
                }
                Class[] paratems = method.getParameterTypes();
                if (paratems.length != 1) {
                    throw new RuntimeException("eventbus只能接收到一个参数");
                }
                ThreadMode threadMode = subscribe.thredMode();
                SubscribleMethod subscribleMethod = new SubscribleMethod(method, threadMode, paratems[0]);
                list.add(subscribleMethod);
            }
            clazz = clazz.getSuperclass();
        }
        return list;
    }

    public void post(final Object object) {
        Set<Object> set = cacheMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final Object activity = iterator.next();
            List<SubscribleMethod> list = cacheMap.get(activity);
            for (final SubscribleMethod subscribleMethod : list) {
                if (subscribleMethod.getEventType().isAssignableFrom(object.getClass())) {
                    switch (subscribleMethod.getThreadMode()) {
                        case Async:
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        invoke(subscribleMethod, activity, object);

                                    }
                                });
                            } else {
                                invoke(subscribleMethod, activity, object);
                            }
                            break;
                        case MainThread:
                            if (Looper.myLooper() == Looper.getMainLooper()){
                                invoke(subscribleMethod, activity, object);
                            }else {
                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        invoke(subscribleMethod, activity, object);
                                    }
                                });
                            }
                            break;
                        case PostThread:
                            break;
                    }
                }
            }
        }
    }

    private void invoke(SubscribleMethod subscribleMethod, Object activity, Object object) {
        Method method = subscribleMethod.getMethod();
        try {
            method.invoke(activity,object);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
