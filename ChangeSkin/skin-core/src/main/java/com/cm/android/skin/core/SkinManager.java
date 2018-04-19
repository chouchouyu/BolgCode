package com.cm.android.skin.core;

import android.app.Application;

public class SkinManager {
    private static SkinManager instance;

    public static void init(Application application) {
        synchronized (SkinManager.class) {
            if (null == instance) {
                instance = new SkinManager(application);
            }
        }
    }
}
