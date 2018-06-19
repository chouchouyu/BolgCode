package com.github.chouchouyu.json.deserializer;


import com.github.chouchouyu.json.JsonConfig;
import com.github.chouchouyu.json.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/6/19.
 */

public class ListDeserializer implements ObjectDeserializer {

    private ParameterizedType type;

    public ListDeserializer(ParameterizedType type) {
        this.type = type;
    }

    @Override
    public <T> T deserializer(JsonConfig config, String json, Object object) {
        JSONArray jsonArray;
        if (null == object) {

            try {
                jsonArray = new JSONArray(json);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            jsonArray = (JSONArray) object;
        }

        List list = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                Object jsonItem = jsonArray.get(i);
                if (jsonItem instanceof JSONObject || jsonItem instanceof JSONArray) {
                    Type itemType = Utils.getItemType(type);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}

