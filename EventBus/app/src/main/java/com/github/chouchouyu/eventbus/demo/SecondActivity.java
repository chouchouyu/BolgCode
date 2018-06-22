package com.github.chouchouyu.eventbus.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.chouchouyu.eventbus.Eventbus;
import com.github.chouchouyu.eventbus.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void send(View view) {
        Eventbus.getDefault().post(new Friend("david","1234"));
    }
}
