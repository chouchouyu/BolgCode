package com.cm.android.skin;

import java.util.Observable;

public class Publish extends Observable {
    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();    //改变通知者的状态
        }
        notifyObservers();    //调用父类Observable方法，通知所有观察者
    }

    private String data = "";


}
