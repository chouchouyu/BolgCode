package com.github.chouchouyu.json;

import android.text.TextUtils;

import com.github.chouchouyu.json.deserializer.ObjectDeserializer;
import com.github.chouchouyu.json.serializer.ObjectSerializer;

import java.lang.reflect.Type;

/**
 * Created by admin on 2018/6/17.
 */

public class JSON {

    public static String toJSONString(Object object) {
        ObjectSerializer serializer = JsonConfig.getGlobalInstance().getSerializer(object.getClass());
        StringBuilder stringBuffer = new StringBuilder();
        serializer.serialzer(JsonConfig.getGlobalInstance(), stringBuffer, object);
        return stringBuffer.toString();
    }

    public static <T> T parse(String json, Type type) {
        return parse(json, type, JsonConfig.getGlobalInstance());
    }

    public static <T> T parse(String json, Class<T> clazz) {
        return parse(json, (Type) clazz, JsonConfig.getGlobalInstance());
    }

    //TODO TYPE?
    private static <T> T parse(String json, Class<T> clazz, JsonConfig config) {
        return parse(json, (Type) clazz, config);

    }

    public static <T> T parse(String json, Type type, JsonConfig config) {
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        ObjectDeserializer deserializer = config.getDeserializer(type);
        return deserializer.deserializer(config, json, null);
    }
}
