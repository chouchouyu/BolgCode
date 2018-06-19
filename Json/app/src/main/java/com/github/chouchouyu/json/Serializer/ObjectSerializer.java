package com.github.chouchouyu.json.serializer;

import com.github.chouchouyu.json.JsonConfig;


/**
 * @author wusm
 */
public interface ObjectSerializer {


    void serialzer(JsonConfig config, StringBuilder out, Object object);
}
