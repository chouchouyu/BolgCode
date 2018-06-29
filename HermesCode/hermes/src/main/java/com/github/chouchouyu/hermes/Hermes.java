package com.github.chouchouyu.hermes;

import android.content.Context;

/**
 * Created by admin on 2018/6/29.
 */

public class Hermes {

    private static Context sContext;

    public static Context getContext(){
        return sContext;
    }

    public static void init(Context context) {
        if (sContext != null) {
            return;
        }
        sContext = context.getApplicationContext();
    }
}
