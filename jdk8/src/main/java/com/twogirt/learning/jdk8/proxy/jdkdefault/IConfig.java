package com.twogirt.learning.jdk8.proxy.jdkdefault;


import com.twogirt.learning.jdk8.FieldType;
import com.twogirt.learning.jdk8.ValueBind;

/**
 * Created by kezhang on 17/1/19.
 */
public interface IConfig {
    @ValueBind(type = FieldType.STRING, value = "db.url")
    String dbUrl();

    @ValueBind(type = FieldType.BOOLEAN, value = "db.validation")
    boolean isValidated();

    @ValueBind(type = FieldType.INT, value = "db.pool.size")
    int poolSize();
}
