package com.github.susan;

/**
 * 静态内部类
 * 可以延迟加载,也能线程安全
 * 缺点,不能传参数
 */
public class InnerClass {

    private InnerClass() {
    }

    private static class SingletonHolder {
        //静态内部类的静态属性实例化,由JVM保证线程的安全
        private static InnerClass instance = new InnerClass();
    }

    //只有调用了getInstance 方法之后,才会实例化Singleton instance属性
    public static InnerClass getInstance() {
        return SingletonHolder.instance;
    }
}
