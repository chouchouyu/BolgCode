package com.github.chouchouyu.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName().toString();
    private String bigJson;
    private long startTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readJsonFile();

    }

    private void readJsonFile() {
        try {
            InputStream inputStream = this.getAssets().open("test.json");
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            int len;
            byte[] buffer = new byte[2048];
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            inputStream.close();
            bigJson = new String(outputStream.toByteArray());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testJson(View view) {
        Child child = new Child("testName", 100);
        String json = JSON.toJSONString(child);
        Log.e(TAG, "序列化Object：" + json);


        List<Object> b = new ArrayList<>();
        b.add("1");
        b.add("2");
        b.add(2);
        b.add(2);
        Log.e(TAG, "序列化集合ArrayList -1:" + JSON.toJSONString(b));

        List<Child> childs = new ArrayList<>();
        childs.add(child);
        childs.add(new Child("张三", 1));
        childs.add(new Child("李四", 2));
        String jsons = JSON.toJSONString(childs);
        Log.e(TAG, "序列化集合ArrayList -2:" + jsons);

        Log.e(TAG, "||-----------------------------");

//        child = JSON.parse(json, Child.class);
    }

    public void testFast(View view) {

    }


    public void begin() {
        startTime = System.currentTimeMillis();
    }

    public void end(String tag) {
        Log.e(TAG, tag + "耗时： " + (System.currentTimeMillis() - startTime));
    }


}
