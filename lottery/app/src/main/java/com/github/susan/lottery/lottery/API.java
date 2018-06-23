package com.github.susan.lottery.lottery;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by susan on 2018/6/23.
 */

public interface API {

    @GET("/api/match/selectlist?platform=koudai_mobile&_prt=https&ver=20180101000000&hide_more=1")
    Call<ResponseBody> getLatest();
}
