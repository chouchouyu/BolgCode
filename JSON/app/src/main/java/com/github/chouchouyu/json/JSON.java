package com.github.chouchouyu.json;

import com.github.chouchouyu.json.Serializer.ObjectSerializer;

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
}
