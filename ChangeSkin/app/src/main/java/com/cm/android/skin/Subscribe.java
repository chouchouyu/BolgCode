package com.cm.android.skin;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现java.util.Observer接口的观察者
 */
public class Subscribe implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Log.e("收到通知:", ((Publish) o).getData());
    }
}
