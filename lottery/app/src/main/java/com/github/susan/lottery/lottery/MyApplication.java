package com.github.susan.lottery.lottery;

import android.app.Application;

import retrofit2.Retrofit;

/**
 * Created by susan on 2018/6/23.
 */

public class MyApplication extends Application {

    public static Retrofit getRetrofit() {
        return retrofit;
    }

    static Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();


        retrofit = new Retrofit.Builder()
                .baseUrl("https://apic.itou.com/") // 设置网络请求的Url地址
//                .addConverterFactory(GsonConverterFactory.create()) // 设置数据解析器
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 支持RxJava平台
                .build();
    }
}
