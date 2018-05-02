package com.github.susan;

import java.util.HashMap;
import java.util.Map;

/**
 * 只能有5个对象
 */
public class Connections {

    private static final int MAX = 5;

    //把所有的对象先存在一个map中
    private static Map<Integer, Connections> map = new HashMap<Integer, Connections>();

    private static int key = 1;


    public static Connections getConnection() {
        Connections ourInstance = map.get(key);
        if (ourInstance == null) {
            synchronized (Connections.class) {
                if (ourInstance == null) {
                    ourInstance = new Connections();
                    map.put(key, ourInstance);
                }
                key++;
                if (key > MAX) {
                    key = 1;
                }
            }

        }
        return ourInstance;
    }
}
