package com.github.chouchouyu.json;


import com.github.chouchouyu.json.deserializer.JavaBeanDeserializer;
import com.github.chouchouyu.json.deserializer.ListDeserializer;
import com.github.chouchouyu.json.deserializer.ObjectDeserializer;
import com.github.chouchouyu.json.serializer.JavaBeanSerializer;
import com.github.chouchouyu.json.serializer.ListSerializer;
import com.github.chouchouyu.json.serializer.ObjectSerializer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
        } else if (List.class.isAssignableFrom(clazz)) {
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

    /**
     * 反序列化
     */
    public Map<Type, ObjectDeserializer> deserializerMap = new HashMap<>();

    public ObjectDeserializer getDeserializer(Type type) {
        ObjectDeserializer deserializer = deserializerMap.get(type);
        if (null == deserializer) {
            if (type instanceof Class) {
                deserializer = new JavaBeanDeserializer((Class) type);
            } else if (type instanceof ParameterizedType) {
                deserializer = new ListDeserializer((ParameterizedType) type);
            }
            deserializerMap.put(type, deserializer);
        }

        return deserializer;
    }
}
