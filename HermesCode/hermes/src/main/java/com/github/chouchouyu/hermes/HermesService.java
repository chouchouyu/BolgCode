package com.github.chouchouyu.hermes;

import android.app.Service;
import android.content.Intent;

/**
 * Created by admin on 2018/6/29.
 */

public abstract class HermesService extends Service {

    @Override
    public void sendBroadcast(Intent intent) {
        super.sendBroadcast(intent);
    }
}
