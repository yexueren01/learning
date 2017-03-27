package com.twogrit.learning.jdk8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ListTest {


    @Test
    public void Test() {
        List<Person> personList = buildPersonList();
        personList.forEach(person -> System.out.println(person.getName()));

    }

    @Test
    public void filter() {

        List<Person> personList = buildPersonList();
        Object[]   persons =  personList.stream().filter(person -> person.getAge() > 6).toArray();
        assertThat(persons,arrayWithSize(3));
        Person person= (Person)persons[0];
        assertThat(person.getName(),equalTo("name7"));
    }


    public List<Person> buildPersonList() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person("name" + i, i));
        }
        return personList;
    }

    public class Person {
        public String Name;
        public int Age;


        public Person(String name, int age) {
            Name = name;
            Age = age;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }
    }
}
