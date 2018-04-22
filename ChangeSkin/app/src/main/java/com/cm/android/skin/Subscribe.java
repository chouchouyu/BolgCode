package com.cm.android.skin;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class Subscribe implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Log.e("收到通知:", ((Publish) o).getData());
    }
}
