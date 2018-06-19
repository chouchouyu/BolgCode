package com.github.chouchouyu.json.serializer;


import com.github.chouchouyu.json.JsonConfig;
import com.github.chouchouyu.json.Utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 专门负责对 序列化 javaBean对象
 * Created by susan on 2018/6/18.
 */

public class JavaBeanSerializer implements ObjectSerializer {

    private final List<FieldSerializer> fieldSerializers;


    public JavaBeanSerializer(Class<?> clazz) {
        Map<String, Field> fieldCacheMap = new HashMap<>();
        Utils.pareserAllFieldToCache(fieldCacheMap, clazz);
        fieldSerializers = Utils.computeGetters(clazz, fieldCacheMap);
    }

    @Override
    public void serialzer(JsonConfig config, StringBuilder out, Object object) {
        out.append("{");
        boolean lastEmpty = false;
        for (FieldSerializer fieldSerializer : fieldSerializers) {

            //"name":"testname" 、 "age":100
            // 如果遇到属性没有值 (null) 则返回 ""
            String serializer = fieldSerializer.serializer(config, object);
            if (lastEmpty && !serializer.isEmpty()) {
                out.append(",");
            }
            if (!lastEmpty) {
                lastEmpty = !serializer.isEmpty();
            }
            out.append(serializer);
        }
        out.append("}");
    }


}
