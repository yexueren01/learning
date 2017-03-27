package com.twogrit.learning.jdk8.annotation;

import com.twogirt.learning.jdk8.simple.Author;
import com.twogirt.learning.jdk8.simple.Description;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/1/19.
 */
public class UtilityTest {

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException {
        //通过运行时反射API获得annotation信息
        Class rt_class = Class.forName("com.twogirt.learning.jdk8.simple.Utility");
        Method[] methods = rt_class.getMethods();
        boolean flag = rt_class.isAnnotationPresent(Description.class);
        if (flag) {
            Description description = (Description) rt_class.getAnnotation(Description.class);
            assertThat(description.value(), equalTo("default des"));
            Method workMethod = rt_class.getMethod("work");
            Method offWork = rt_class.getMethod("offWork");
            if (workMethod.isAnnotationPresent(Author.class)) {
                Author author = (Author) workMethod.getAnnotation(Author.class);
                assertThat(author.name(), equalTo("ke.zhang"));
                assertThat(author.group(), equalTo("com.alipay"));
            }
            if (offWork.isAnnotationPresent(Author.class)) {
                Author author = (Author) offWork.getAnnotation(Author.class);
                assertThat(author.name(), equalTo("changedName"));
                assertThat(author.group(), equalTo("com.out"));

            }
        }
    }
}
