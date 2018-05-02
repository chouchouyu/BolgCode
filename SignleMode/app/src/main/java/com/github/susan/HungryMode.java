package com.github.susan;

/**
 * 饿汉式
 * 缺点:
 * 1. 无法向单例对象的构造方法传参
 *
 */
public class HungryMode {
    private static final HungryMode ourInstance = new HungryMode();

    public static HungryMode getInstance() {
        return ourInstance;
    }

    private HungryMode() {
    }
}
