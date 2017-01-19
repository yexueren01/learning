package com.twogrit.learning.java8.annotation.invocation;

import sun.jvm.hotspot.debugger.cdbg.AccessControl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.security.AccessControlException;
import java.util.Arrays;

/**
 * Created by kezhang on 17/1/19.
 */
public class AccessInvocationHandler<T> implements InvocationHandler {
    final T accessObj;

    public AccessInvocationHandler(T accessObj) {
        this.accessObj = accessObj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RequiredRoles annotation = method.getAnnotation(RequiredRoles.class); //通过反射API获取注解
        if (annotation != null) {
            String[] roles = annotation.value();
//            Parameter[]  parameters = method.getParameters();
//            Parameter roleParameter = parameters[0];
            Role role = (Role) args[0];
            if (!Arrays.asList(roles).contains(role.getName())) {
                throw new AccessControlException("The user is not allowed to invoke this method.");
            }
        }

        return method.invoke(accessObj, args);
    }
}