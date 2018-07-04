package com.github.chouchouyu.hermes.sender;

import com.github.chouchouyu.hermes.HermesService;
import com.github.chouchouyu.hermes.util.HermesException;
import com.github.chouchouyu.hermes.util.TypeCenter;
import com.github.chouchouyu.hermes.wrapper.MethodWrapper;
import com.github.chouchouyu.hermes.wrapper.ObjectWrapper;
import com.github.chouchouyu.hermes.wrapper.ParameterWrapper;

import java.lang.reflect.Method;

/**
 * Created by admin on 2018/6/29.
 */

public abstract class Sender {

    protected static final TypeCenter TYPE_CENTER = TypeCenter.getInstance();

    private ObjectWrapper mObject;

    private ParameterWrapper[] mParameters;

    private Class<? extends HermesService> mService;


    public Sender(Class<? extends HermesService> service, ObjectWrapper object) {
        mService = service;
        mObject = object;
    }

    protected abstract MethodWrapper getMethodWrapper(Method method, ParameterWrapper[] parameterWrappers) throws HermesException;

    public void setmParameters(ParameterWrapper[] mParameters) {
        this.mParameters = mParameters;
    }

    /**
     * constructor is like method.
     * <p>
     * method: parameter --> no need to register, but should be registered in the remote process (* by hand, or user will forget to add annotation), especially when the type is subclass.
     * should have the same class id and can be inverted by json.
     * callback parameter --> see below
     * return type --> should be registered (**)(esp subclass), no need to registered in the remote process.
     * should have the same class id and can be inverted by json.
     * <p>
     * callback: parameter --> should be registered (***)(esp subclass), no need to registered in the remote process.
     * return type --> no need to register, but should be registered in the remote process (****)(esp subclass).
     * <p>
     * In Hermes, we can control the registration of classes, but the subclasses should be registered by users.
     */

    private void registerClass(Method method) throws HermesException {
        if (method == null) {
            return;
        }
        Class<?>[] classes = method.getParameterTypes();
        for (Class<?> clazz :
                classes) {
            if (clazz.isInterface()) {
                TYPE_CENTER.register(clazz);
                registerCallbackMethodParameterTypes(clazz);
            }
        }
        TYPE_CENTER.register(method.getReturnType());
    }

    private void registerCallbackMethodParameterTypes(Class<?> clazz) {
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                TYPE_CENTER.register(parameterType);
            }
        }
    }
}
