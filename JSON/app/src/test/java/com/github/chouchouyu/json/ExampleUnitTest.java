package com.github.chouchouyu.json;


import com.alibaba.fastjson.TypeReference;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    public static class Bean {
        private int i;
        public List<? super Number> list;
        public Map<String, Integer> map;

        public Bean() {
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    @Test
    public void addition_isCorrect() throws Exception {
        Class<Bean> beanClass = Bean.class;
        System.out.println("所有public属性");
        for (Field field : beanClass.getFields()) {
            System.out.println(field.getName());
        }

        System.out.println("所有包括 非public属性");
        for (Field field : beanClass.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        System.out.println("所有public函数 包括到Object:");
        for (Method method : beanClass.getMethods()) {
            String methodName = method.getName();
            System.out.println(methodName);
        }

        System.out.println("所有对象的函数:");
        for (Method method : beanClass.getDeclaredMethods()) {
            String methodName = method.getName();
            System.out.println(methodName);
        }

        Field list = Bean.class.getField("list");

        if (List.class.isAssignableFrom(list.getType())) {
            Type genericType = list.getGenericType();

            if (genericType instanceof ParameterizedType) {
                Type type = ((ParameterizedType) genericType).getActualTypeArguments()[0];

                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (upperBounds.length == 1) {
                        Type actualTypeArgument = upperBounds[0];
                        //object
                        System.out.println("获得泛型上边界类型:" + actualTypeArgument);
                    }
                } else {
                    //object
                    System.out.println("获得泛型类型:" + type);
                }
            }
        }
        System.out.println(new TypeReference<Object>() {
        }.getType());
    }

    @Test
    public void addition_isCorrect2() throws Exception {
        Map<String, Field> fieldCacheMap = new HashMap<>();
        Utils.pareserAllFieldToCache(fieldCacheMap, Child.class);
        for (Map.Entry<String, Field> stringFieldEntry : fieldCacheMap.entrySet()) {
            System.out.println(stringFieldEntry.getKey() + ":" + stringFieldEntry.getValue().getName());
        }
    }

    @Test
    public void addition_isCorrect3() throws Exception {
        StringBuffer out = new StringBuffer();
        out.append("{");
        int i = 0;
        for (int j = 0; j < 2; j++) {
            if (i != 0) {
                out.append(",");
            }
            //"name":"testname" 、 "age":100
            // 如果遇到属性没有值 (null) 则返回 ""
            String serializer = "";
            if (j == 0) {
                serializer = "\"name\":\"testname\"";
            }
            out.append(serializer);
            if (serializer.isEmpty()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        out.append("}");
        //{}
        System.out.println(out);
    }


    @Test
    public void addition_isCorrect4() throws Exception {
        List<List<Child>> childLists = new ArrayList<>();
        List<Child> child1 = new ArrayList<>();
        child1.add(new Child("T1", 100));
        child1.add(new Child("T2", 200));
        childLists.add(child1);
        List<Child> child2 = new ArrayList<>();
        Child t3 = new Child("T3", 300);
        t3.childs = new ArrayList<>();
        t3.childs.add(new Child("T3_1", 3100));
        t3.childs.add(new Child("T3_2", 3200));
        child2.add(t3);
        child2.add(new Child("T4", 400));
        childLists.add(child2);



        String s = JSON.toJSONString(child1);
        System.out.println(s);

        Object object = com.alibaba.fastjson.JSON.parseObject(s, new com.alibaba.fastjson.TypeReference<List<List<Child>>>() {
        }.getType());
        System.out.println(object);



    }
}