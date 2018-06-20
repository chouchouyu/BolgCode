package com.github.chouchouyu.eventbus;

import android.app.Application;
import android.util.Log;

/**
 * Created by admin on 2018/6/20.
 */

public class MyAppliocation extends Application {
    
    private static int i = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("david", "onCreate: " + (i++));
    }
}