package com.twogrit.learning.java8.annotation;

import com.twogrit.learning.java8.annotation.invocation.AccessInvocationHandler;
import com.twogrit.learning.java8.annotation.invocation.IMethodNeesAdminRole;
import com.twogrit.learning.java8.annotation.invocation.MethodNeesAdminRole;
import com.twogrit.learning.java8.annotation.invocation.Role;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.security.AccessControlException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/1/19.
 */
public class InvocationTest {
    IMethodNeesAdminRole proxyMethodNeesAdminRole01;

    @Before
    public void setUp() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        proxyMethodNeesAdminRole01 = buildProxy01();
    }


    @Test
    public void test() {
        Role role = new Role("admin");
        assertThat(proxyMethodNeesAdminRole01.invoke(role), equalTo("done"));
    }

    @Test(expected = AccessControlException.class)
    public void test0() {
        Role role = new Role("a");
        proxyMethodNeesAdminRole01.invoke(role);
    }


    IMethodNeesAdminRole buildProxy01() {
        MethodNeesAdminRole methodNeesAdminRole = new MethodNeesAdminRole();
        AccessInvocationHandler handler = new AccessInvocationHandler(methodNeesAdminRole);
        return (IMethodNeesAdminRole) Proxy.newProxyInstance(IMethodNeesAdminRole.class.getClassLoader(),
                new Class[]{IMethodNeesAdminRole.class},
                handler);

    }


}
