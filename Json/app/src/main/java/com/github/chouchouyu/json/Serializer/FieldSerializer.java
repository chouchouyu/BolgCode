package com.github.chouchouyu.json.serializer;

import com.github.chouchouyu.json.FieldInfo;
import com.github.chouchouyu.json.JsonConfig;
import com.github.chouchouyu.json.Utils;

/**
 * Created by susan on 2018/6/18.
 */

public class FieldSerializer {
    private String key;
    private FieldInfo fieldInfo;
    private boolean isPrimitive;

    public FieldSerializer(FieldInfo fieldInfo) {
        this.fieldInfo = fieldInfo;
        this.key = '"' + fieldInfo.name + "\":";
        Class type = fieldInfo.type;
        //是否是基本数据类型或者其包装类
        isPrimitive = Utils.isBox(type) || type.isPrimitive();
    }

    public String serializer(JsonConfig config, Object object) {
        Object o = fieldInfo.get(object);
        if (null == o) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (isPrimitive) {
            stringBuilder.append(key);
            stringBuilder.append(o);
        } else if (Utils.isString(fieldInfo.type)) {
            stringBuilder.append(key);
            stringBuilder.append('\"');
            stringBuilder.append(o);
            stringBuilder.append('\"');
        } else {
            ObjectSerializer objectSerializer = config.getSerializer(fieldInfo.type);
            stringBuilder.append(key);
            objectSerializer.serialzer(config, stringBuilder, o);
        }
        return stringBuilder.toString();
    }

    public FieldInfo getFieldInfo() {
        return fieldInfo;
    }
}
