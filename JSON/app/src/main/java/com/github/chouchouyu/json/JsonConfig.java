package com.github.chouchouyu.json;


import com.github.chouchouyu.json.Serializer.JavaBeanSerializer;
import com.github.chouchouyu.json.Serializer.ListSerializer;
import com.github.chouchouyu.json.Serializer.ObjectSerializer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/6/17.
 */

public class JsonConfig {

    private final static JsonConfig globalInstance = new JsonConfig();

    //序列化器缓存
    public static JsonConfig getGlobalInstance() {
        return globalInstance;
    }

    /**
     * 序列化
     */
    public Map<Class, ObjectSerializer> serializerMap = new HashMap<>();


    public ObjectSerializer getSerializer(Class<?> clazz) {
        ObjectSerializer objectSerializer = serializerMap.get(clazz);
        if (null != objectSerializer) {
            return objectSerializer;
        }else if (List.class.isAssignableFrom(clazz)) {
            objectSerializer = ListSerializer.instance;
        } else if (Map.class.isAssignableFrom(clazz)) {
            throw new RuntimeException("暂不支持Map序列化");
        } else if (clazz.isArray()) {
            throw new RuntimeException("暂不支持数组序列化");
        } else {
            objectSerializer = new JavaBeanSerializer(clazz);
        }

        serializerMap.put(clazz, objectSerializer);
        return objectSerializer;
    }

}
