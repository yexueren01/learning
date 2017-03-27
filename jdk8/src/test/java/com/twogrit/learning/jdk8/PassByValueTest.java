package com.twogrit.learning.jdk8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PassByValueTest {

    public static List<List<String>> stringListList = new ArrayList<List<String>>();
    public static List<String> stringList = new ArrayList<String>();

    static {
        /*
            stringListList.add(stringList):stringListList[*]->stringListValue
            stringList.add("test" + i):stringListValue[*]->"test" + i
            stringList = new ArrayList<String>():stringList重新指向new的对象但是不改变stringListList[*]->stringListValue
         */
        for(int i=0;i<10;i++){
            stringListList.add(stringList);
            stringList.add("test" + i);
            stringList = new ArrayList<String>();
        }
    }

    @Test
    public void should() {
        for(int i=0;i<10;i++){
            assertThat("test"+i, equalTo(PassByValueTest.stringListList.get(i).get(0)));
        }
    }

}
