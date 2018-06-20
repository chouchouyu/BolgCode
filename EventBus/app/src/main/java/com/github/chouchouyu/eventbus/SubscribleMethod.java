package com.github.chouchouyu.eventbus;

import java.lang.reflect.Method;

/**
 * Created by admin on 2018/6/20.
 */

public class SubscribleMethod {

    private Method method;
    private ThreadMode threadMode;
    private Class<?> eventType;

    public SubscribleMethod(Method method, ThreadMode threadMode, Class<?> eventType) {
        this.method = method;
        this.threadMode = threadMode;
        this.eventType = eventType;
    }

    public Method getMethod() {
        return method;
    }

    public ThreadMode getThreadMode() {
        return threadMode;
    }

    public Class<?> getEventType() {
        return eventType;
    }
}
