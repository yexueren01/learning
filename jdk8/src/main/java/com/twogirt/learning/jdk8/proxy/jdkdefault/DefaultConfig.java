package com.twogirt.learning.jdk8.proxy.jdkdefault;

import com.twogirt.learning.jdk8.FieldType;
import com.twogirt.learning.jdk8.ValueBind;

/**
 * Created by kezhang on 17/3/27.
 */
public class DefaultConfig implements IConfig {
    @Override


    @ValueBind(type = FieldType.STRING, value = "db.url")
    public String dbUrl() {
        return "defaultValue";
    }

    @Override

    @ValueBind(type = FieldType.BOOLEAN, value = "db.validation")
    public boolean isValidated() {
        return false;
    }

    @Override

    @ValueBind(type = FieldType.INT, value = "db.pool.size")
    public int poolSize() {
        return 0;
    }
}
