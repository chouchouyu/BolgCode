package com.github.susan.lottery.lottery;

import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by susan on 2018/6/23.
 */

public class Helper {

    public static final String TAG = "LOTTERY :";

    public static void webRequest() {
        Retrofit retrofit = MyApplication.getRetrofit();
        // 创建 网络请求接口 的实例
        API request = retrofit.create(API.class);

        //对 发送请求 进行封装
        Call<ResponseBody> call = request.getLatest();


        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<ResponseBody>() {
            //请求成功时回调
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                // 步骤7：处理返回的数据结果
                try {
                    String rawResponse = response.body().string();
                    JsonBean objeclt = JSON.parseObject(rawResponse, JsonBean.class);
                    Map<String, LinkedHashMap<String, String>> rawMap = objeclt.getData();
//                    Map<String, Map<String, OneDayInfoBean>> map = new TreeMap<>();
//
                    for (String key : rawMap.keySet()) {
                        LinkedHashMap<String, String> m = rawMap.get(key);
                        for (String sKey : m.keySet()) {
                            String v = m.get(sKey);
                            OneDayInfoBean oneDayInfoBean = JSON.parseObject(v, OneDayInfoBean.class);
                            oneDayInfoBean.getLeague_name();
                            oneDayInfoBean.getLeague_color(); //Array
                            oneDayInfoBean.getHost_name_s();
                            oneDayInfoBean.getGuest_name_s();
                            Log.w(TAG, oneDayInfoBean.getList().getSportteryNWDL().getOdds().toString());
                            oneDayInfoBean.getList().getSportteryWDL().getOdds().toString();//让
                        }

//                        Map<String, OneDayInfoBean> m = new HashMap<>();


//                        map.put(key, JSON.parseObject(rawMap.get(key), OneDayInfoBean.class));
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //请求失败时回调
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                Log.w(TAG, "webRequest " + "onFailure");
            }
        });
    }
}
