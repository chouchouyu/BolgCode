package com.github.chouchouyu.hermes.util;

import android.content.Context;

import com.github.chouchouyu.hermes.annotation.ClassId;
import com.github.chouchouyu.hermes.annotation.MethodId;
import com.github.chouchouyu.hermes.annotation.WithinProcess;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by admin on 2018/6/29.
 */

public class TypeUtils {

    public static String getClassId(Class<?> clazz) {
        ClassId classId = clazz.getAnnotation(ClassId.class);
        if (classId != null) {
            return classId.value();
        } else {
            return clazz.getName();
        }
    }

    public static String getMethodId(Method method) {
        MethodId methodId = method.getAnnotation(MethodId.class);
        if (methodId != null) {
            return methodId.value();
        } else {
            StringBuilder result = new StringBuilder(method.getName());
            result.append('(').append(getMethodParameters(method.getParameterTypes())).append(')');
            return result.toString();
        }
    }

    public static String getMethodParameters(Class<?>[] classes) {
        StringBuilder result = new StringBuilder();
        int length = classes.length;
        if (length == 0) {
            return result.toString();
        }
        result.append(getClassName(classes[0]));
        for (int i = 1; i < length; ++i) {
            result.append(",").append(getClassName(classes[i]));
        }
        return result.toString();
    }


    //boolean, byte, char, short, int, long, float, and double void
    private static String getClassName(Class<?> clazz) {
        if (clazz == Boolean.class) {
            return "boolean";
        } else if (clazz == Byte.class) {
            return "byte";
        } else if (clazz == Character.class) {
            return "char";
        } else if (clazz == Short.class) {
            return "short";
        } else if (clazz == Integer.class) {
            return "int";
        } else if (clazz == Long.class) {
            return "long";
        } else if (clazz == Float.class) {
            return "float";
        } else if (clazz == Double.class) {
            return "double";
        } else if (clazz == Void.class) {
            return "void";
        } else {
            return clazz.getName();
        }
    }

    public static void validateClass(Class<?> clazz) {
        if (clazz == null) {
            throw new IllegalArgumentException("Class object is null.");
        }
        if (clazz.isPrimitive() || clazz.isInterface()) {
            return;
        }
        if (clazz.isAnnotationPresent(WithinProcess.class)) {
            throw new IllegalArgumentException(
                    "Error occurs when registering class " + clazz.getName()
                            + ". Class with a WithinProcess annotation presented on it cannot be accessed"
                            + " from outside the process.");
        }

        if (clazz.isAnonymousClass()) {
            throw new IllegalArgumentException(
                    "Error occurs when registering class " + clazz.getName()
                            + ". Anonymous class cannot be accessed from outside the process.");
        }
        if (clazz.isLocalClass()) {
            throw new IllegalArgumentException(
                    "Error occurs when registering class " + clazz.getName()
                            + ". Local class cannot be accessed from outside the process.");
        }
        if (Context.class.isAssignableFrom(clazz)) {
            return;
        }
        if (Modifier.isAbstract(clazz.getModifiers())) {
            throw new IllegalArgumentException(
                    "Error occurs when registering class " + clazz.getName()
                            + ". Abstract class cannot be accessed from outside the process.");
        }
    }
}
