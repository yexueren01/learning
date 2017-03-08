package com.twogrit.learning.java8.proxy;

import com.twogrit.learning.java8.annotation.reflect.FieldType;
import com.twogrit.learning.java8.annotation.reflect.ValueBind;

/**
 * Created by kezhang on 17/1/19.
 */
public interface IConfig {
    @ValueBind(type = FieldType.STRING, value = "db.url")
    String dbUrl();

    @ValueBind(type = FieldType.STRING, value = "db.validation")
    boolean isValidated();

    @ValueBind(type = FieldType.STRING, value = "db.pool.size")
    int poolSize();
}
