package com.github.chouchouyu.json;

import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/6/17.
 */

public class JsonConfig {
    public final static JsonConfig globalInstance = new JsonConfig();

    public final static JsonConfig getGlobalInstance() {
        return globalInstance;
    }

    /**
     * 序列化
     */
    public Map<Class, ObjectSerializer> serializerMap = new HashMap<>();

    public ObjectSerializer getSerializer(Class<?> clazz) {
        ObjectSerializer   serializerMap.get(clazz);
    }

}
