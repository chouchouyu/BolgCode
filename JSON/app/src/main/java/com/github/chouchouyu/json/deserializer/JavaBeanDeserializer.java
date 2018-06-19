package com.github.chouchouyu.json.deserializer;

import com.github.chouchouyu.json.FieldInfo;
import com.github.chouchouyu.json.JsonConfig;
import com.github.chouchouyu.json.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/6/19.
 */

public class JavaBeanDeserializer implements ObjectDeserializer {

    /**
     * 所有的非公开属性
     */
    private final List<FieldInfo> setter;
    private final Class beanType;


    public JavaBeanDeserializer(Class clazz) {
        this.beanType = clazz;
        Map<String, Field> fieldCacheMap = new HashMap<>();
        Utils.pareserAllFieldToCache(fieldCacheMap, clazz);
        setter = Utils.computeSetters(clazz, fieldCacheMap);
    }

    @Override
    public <T> T deserializer(JsonConfig config, String json, Object object) {
        JSONObject jsonObject;
        if (null == object) {
            try {
                jsonObject = new JSONObject(json);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            jsonObject = (JSONObject) object;
        }
        T t;
        try {
            t = (T) beanType.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (FieldInfo fieldInfo : setter) {
            if (!jsonObject.has(fieldInfo.name)) {
                continue;
            }
            try {
                Object value = jsonObject.get(fieldInfo.name);
                if (value instanceof JSONObject) {
                    ObjectDeserializer deserializer = config.getDeserializer(fieldInfo.type);
                    Object obj = deserializer.deserializer(config, null, value);
                    fieldInfo.set(t, obj);
                } else if (value instanceof JSONArray) {
                    //Java Field.getGenericType()/getType()返回对象的区别
                    ObjectDeserializer deserializer = config.getDeserializer(fieldInfo.field.getGenericType());
                    Object item = deserializer.deserializer(config, null, value);
                    fieldInfo.set(t, item);
                } else {
                    if (value != JSONObject.NULL) {
                        fieldInfo.set(t, value);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
