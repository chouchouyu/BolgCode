package com.github.chouchouyu.eventbus.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.github.chouchouyu.eventbus.Eventbus;
import com.github.chouchouyu.eventbus.R;
import com.github.chouchouyu.eventbus.Subscribe;
import com.github.chouchouyu.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Eventbus.getDefault().register(this);
        text= (TextView) findViewById(R.id.text_content);
    }

    public void change(View view)
    {
        startActivity(new Intent(this,SecondActivity.class));
    }
    //主线程---子线程接受
    @Subscribe(threadMode = ThreadMode.Async)
    public void receive(Friend friend ) {
        Log.i("david", "thread: " + Thread.currentThread().getName());
    }
}
