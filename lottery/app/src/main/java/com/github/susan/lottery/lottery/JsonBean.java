package com.github.susan.lottery.lottery;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by susan on 2018/6/23.
 */

public class JsonBean {


    /**
     * msg : ok
     * data : Json
     * use_cache : 1
     * errcode : 0
     */

    private String msg;
    private LinkedHashMap<String, LinkedHashMap<String, String>> data;
    private int use_cache;
    private int errcode;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LinkedHashMap<String, LinkedHashMap<String, String>> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String, LinkedHashMap<String, String>> data) {
        this.data = data;
    }

    public int getUse_cache() {
        return use_cache;
    }

    public void setUse_cache(int use_cache) {
        this.use_cache = use_cache;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

}
