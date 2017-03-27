package com.twogirt.learning.jdk8.proxy.jdkdefault;

import com.twogirt.learning.jdk8.FieldType;
import com.twogirt.learning.jdk8.ValueBind;
import com.twogirt.learning.jdk8.proxy.PropertiesConfig;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kezhang on 17/3/27.
 */
public class DefaultInvocationHandler  implements InvocationHandler {



    private  IConfig target;

    public DefaultInvocationHandler(IConfig target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ValueBind valueBind=  method.getAnnotation(ValueBind.class);
        String propertyKey= valueBind.value();
        FieldType fieldType=valueBind.type();

        Object propertyValue=   PropertiesConfig.get(propertyKey);
        if(null==propertyValue){
            return method.invoke(target,args);

        }else {
            return  fieldType.parse(propertyValue) ;
        }
    }
}
