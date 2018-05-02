package com.github.susan;

import android.content.Context;

/**
 * 饿汉式
 * 优点:
 * 1. 解决了饿汉式不能传参
 * 缺点:
 * 1.多线程的时候可能new 多个,单例不严谨
 */
public class LazyMode {
    private static LazyMode ourInstance;

    private LazyMode(Context context) {
        //....do the things your wanna
    }

    public static LazyMode getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new LazyMode(context);
        }
        return ourInstance;
    }


}
