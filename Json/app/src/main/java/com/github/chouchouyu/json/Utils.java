package com.github.chouchouyu.json;


import com.github.chouchouyu.json.Serializer.FieldSerializer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by susan on 2018/6/18.
 */

public class Utils {

    public static boolean isBox(Class type) {
        return type == Integer.class ||
                type == Character.class ||
                type == Byte.class ||
                type == Boolean.class ||
                type == Double.class ||
                type == Float.class ||
                type == Short.class;
    }

    public static boolean isString(Class type) {
        return CharSequence.class.isAssignableFrom(type);
    }

    public static Map<String, Field> pareserAllFieldToCache(Map<String, Field> fieldCacheMap,Class<?> clazz) {

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            if (!fieldCacheMap.containsKey(fieldName)) {
                fieldCacheMap.put(fieldName, field);
            }
        }

        if (clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class) {
            pareserAllFieldToCache(fieldCacheMap,clazz.getSuperclass());
        }
        return fieldCacheMap;
    }


//    public static Map<String, Field> pareserAllFieldToCache(Map<String, Field> fieldCacheMap, Class<?> clazz) {
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields) {
//            String fieldName = field.getName();
//            if (!fieldCacheMap.containsKey(fieldName)) {
//                fieldCacheMap.put(fieldName, field);
//            }
//        }
//
//        if (clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class) {
//            pareserAllFieldToCache(fieldCacheMap, clazz.getSuperclass());
//        }
//        return fieldCacheMap;
//    }

    public static List<FieldSerializer> computeGetters(Class<?> clazz, Map<String, Field> fieldCacheMap) {

        Map<String, FieldInfo> fieldInfoMap = new LinkedHashMap<>();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (Modifier.isStatic(method.getModifiers())) {
                continue;
            }
            //set方法
            if (method.getReturnType().equals(Void.TYPE)) {
                continue;
            }
            if (method.getParameterTypes().length != 0) {
                continue;
            }
            if (methodName.equals("getClass")) {
                continue;
            }

            String propertyName;
            if (methodName.startsWith("get")) {
                if (methodName.length() < 4) {
                    continue;
                }

                char getName = methodName.charAt(3);//首字母变
                propertyName = Character.toLowerCase(getName) + methodName.substring(4);
                Field field = fieldCacheMap.get(propertyName);
                FieldInfo fieldInfo = new FieldInfo(propertyName, method, field);
                fieldInfoMap.put(propertyName, fieldInfo);
            }else if (methodName.startsWith("is")) {
                if (methodName.length() < 3) {
                    continue;
                }
                if (method.getReturnType() != Boolean.TYPE
                        && method.getReturnType() != Boolean.class) {
                    continue;
                }
                char getName = methodName.charAt(2);
                propertyName = Character.toLowerCase(getName) + methodName.substring(3);
                if (fieldInfoMap.containsKey(propertyName)) {
                    continue;
                }
                Field field = fieldCacheMap.get(propertyName);
                FieldInfo fieldInfo = new FieldInfo(propertyName, method, field);
                fieldInfoMap.put(propertyName, fieldInfo);
            }
        }


        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            String propertyName = field.getName();
            if (!fieldInfoMap.containsKey(propertyName)) {
                FieldInfo fieldInfo = new FieldInfo(propertyName, null, field);
                fieldInfoMap.put(propertyName, fieldInfo);
            }
        }

        List<FieldSerializer> fieldInfos = new ArrayList<>();
        for (FieldInfo fieldInfo : fieldInfoMap.values()) {
            fieldInfos.add(new FieldSerializer(fieldInfo));
        }
        return fieldInfos;
    }


}
