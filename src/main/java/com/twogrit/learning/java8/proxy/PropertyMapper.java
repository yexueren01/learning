package com.twogrit.learning.java8.proxy;

import com.twogrit.learning.java8.annotation.reflect.ValueBind;

import javax.xml.ws.BindingType;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by kezhang on 17/1/19.
 */
public class PropertyMapper implements InvocationHandler {
    Properties properties;

    public PropertyMapper(Properties properties) {
        this.properties = properties;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ValueBind valueBindAnnotation = method.getAnnotation(ValueBind.class);
        valueBindAnnotation.value();
        valueBindAnnotation.type();


        return null;
    }

}
