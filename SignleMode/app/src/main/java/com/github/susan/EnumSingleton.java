package com.github.susan;

public enum EnumSingleton {
    instance;

    public void getInstance() {
        System.out.print("处理中.....");
    }
}
