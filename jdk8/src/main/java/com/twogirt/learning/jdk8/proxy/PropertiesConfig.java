package com.twogirt.learning.jdk8.proxy;

import java.util.Properties;

/**
 * Created by kezhang on 17/3/27.
 */
public class PropertiesConfig {
    static Properties properties=new Properties();

    static {
        properties.put("db.validation", true);
        properties.put("db.pool.size", 100);
    }

    public static Object get(Object key){
      return   properties.get(key);
    }
}
