package com.github.susan;

import android.content.Context;

/**
 * 双重检查
 * 最常用
 */
public class LazyModeDoubleLock {
    private volatile static LazyModeDoubleLock ourInstance;

    private LazyModeDoubleLock(Context context) {
        //....do the things your wanna
    }

    public static LazyModeDoubleLock getInstance(Context context) {
        if (ourInstance == null) {
            synchronized (LazyModeDoubleLock.class) {
                if (ourInstance == null) {
                ourInstance = new LazyModeDoubleLock(context);
                }
            }

        }
        return ourInstance;
    }

    //1.由于 synchronized 消耗性能 所以不写在方法上 public synchronized static XX XX(){}
    //2.instance 多cpu操作 时会拷贝副本到缓存空间里,volatile 可以控制不缓存,但是性能会变慢
    //线程并发时,当变量被改动了,所有的线程都能即时访问到最新的数据
    //会屏蔽掉虚拟机的一些代码优化

}