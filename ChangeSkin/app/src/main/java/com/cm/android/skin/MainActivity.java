package com.cm.android.skin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    Publish publish;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        publish = new Publish();
        Subscribe subscribe = new Subscribe();
        publish.addObserver(subscribe);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        publish.setData("开始---" + (i++));
    }
}
