package com.twogirt.learning.jdk8.proxy.jdkdefault;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by kezhang on 17/1/19.
 */
public class ProxyConfigFactory {




    //给目标对象生成代理对象
    public  static  IConfig getProxyInstance(IConfig target) {

        InvocationHandler invocationHandler=new  DefaultInvocationHandler(target);
        return (IConfig) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), invocationHandler
        );
    }

}
