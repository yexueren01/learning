package com.twogirt.learning.jdk8;

/**
 * Created by kezhang on 17/1/19.
 */
public class Student {

    private String name = "";

    public String getName() {
        return name;
    }

    @ValueBind(type = FieldType.STRING, value = "aa")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @ValueBind(type = FieldType.INT, value = "30")
    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    @ValueBind(type = FieldType.STRING, value = "101")
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    private int age = 0;
    private String studentId = "";
}
