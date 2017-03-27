package com.twogrit.learning.jdk8.annotation;

import com.twogirt.learning.jdk8.Student;
import com.twogirt.learning.jdk8.ValueBind;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by kezhang on 17/1/19.
 */
public class ReflectTest {

    @Test
    public void test() throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {


        Student annotaedStudent = buildDefaultAnnotationStudent();
        System.out.println("studentId====" + annotaedStudent.getStudentId()
                + "  studentnName====" + annotaedStudent.getName()
                + "   student Age====" + annotaedStudent.getAge());

    }

    public Student buildDefaultAnnotationStudent() throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Student student = (Student) Class.forName("com.twogirt.learning.jdk8.Student").newInstance();

        Method[] methodArray = student.getClass().getDeclaredMethods();
        for (int i = 0; i < methodArray.length; i++) {
            if (methodArray[i].isAnnotationPresent(ValueBind.class)) {
                ValueBind annotation = methodArray[i]
                        .getAnnotation(ValueBind.class);
                String type = String.valueOf(annotation.type());
                String value = annotation.value();
                if (type.equals("INT")) {
                    methodArray[i].invoke(student, new Integer[]{new Integer(
                            value)});
                } else {
                    methodArray[i].invoke(student, new String[]{value});
                }
            }
        }

        return student;
    }

}
