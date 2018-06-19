package com.github.chouchouyu.json.deserializer;

import com.github.chouchouyu.json.JsonConfig;

/**
 * Created by admin on 2018/6/19.
 */

public interface ObjectDeserializer {
    <T> T deserializer(JsonConfig config, String json, Object object);
}
