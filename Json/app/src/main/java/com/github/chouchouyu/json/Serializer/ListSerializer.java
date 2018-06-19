package com.github.chouchouyu.json.serializer;

import com.github.chouchouyu.json.JsonConfig;
import com.github.chouchouyu.json.Utils;

import java.util.List;

/**
 * Created by susan on 2018/6/18.
 */

public class ListSerializer implements ObjectSerializer {

    public static ListSerializer instance = new ListSerializer();

    @Override
    public void serialzer(JsonConfig config, StringBuilder out, Object object) {
        List<?> list = (List<?>) object;
        if (list.isEmpty()) {
            out.append("[]");
            return;
        }
        out.append("[");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                out.append(',');
            }
            Object item = list.get(i);
            if (null == item) {
                out.append("null");
            } else {
                Class<?> clazz = item.getClass();
                if (Utils.isBox(clazz)) {
                    out.append(item);
                } else if (Utils.isString(clazz)) {
                    out.append("\"");
                    out.append(item);
                    out.append("\"");
                } else {
                    ObjectSerializer serializer = config.getSerializer(clazz);
                    serializer.serialzer(config, out, item);
                }
            }
        }
        out.append("]");
    }
}
