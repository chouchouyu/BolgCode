package com.github.chouchouyu.json;

import com.alibaba.fastjson.serializer.JSONSerializer;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author wusm
 */
public interface ObjectSerializer {

    void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType) throws IOException;
}
