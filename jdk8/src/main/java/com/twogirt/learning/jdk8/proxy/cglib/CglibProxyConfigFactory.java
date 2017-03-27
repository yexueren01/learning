package com.twogirt.learning.jdk8.proxy.cglib;

import com.twogirt.learning.jdk8.FieldType;
import com.twogirt.learning.jdk8.ValueBind;
import com.twogirt.learning.jdk8.proxy.PropertiesConfig;
import com.twogirt.learning.jdk8.proxy.jdkdefault.IConfig;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by kezhang on 17/3/27.
 */
public class CglibProxyConfigFactory implements MethodInterceptor {

    //维护目标对象
    private IConfig target;

    public CglibProxyConfigFactory(IConfig target) {
        this.target = target;
    }

    public IConfig getProxyInstance() {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return (IConfig) en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        ValueBind valueBind = method.getAnnotation(ValueBind.class);

        String propertyKey = valueBind.value();
        FieldType fieldType = valueBind.type();
        Object propertyValue = PropertiesConfig.get(propertyKey);
        if (null == propertyValue) {
            return method.invoke(target, objects);
        } else {
            return fieldType.parse(propertyValue);
        }
    }
}
