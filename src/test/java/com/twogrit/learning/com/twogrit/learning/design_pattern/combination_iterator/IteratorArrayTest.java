package com.twogrit.learning.com.twogrit.learning.design_pattern.combination_iterator;

import com.twogrit.learning.design_pattern.combination_iterator.IteratorArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class IteratorArrayTest {
    @Test
    public void testt(){
        String [] strings={"a","b","c","d"};
        IteratorArray<String> iteratorArray=new IteratorArray<String> (strings);
        List<String> stringTargetList = asList(strings);
        List<String> stringList=new ArrayList<String>();
        while (iteratorArray.hasNext()) {
            stringList.add(iteratorArray.next());
        }
        assertThat(stringList,hasSize(4));
        assertThat(stringList,contains("a","b","c","d"));
    }
    @Test
    public void testHasOne(){
        String [] strings={"a"};
        IteratorArray<String> iteratorArray=new IteratorArray<String> (strings);
        List<String> stringTargetList = asList(strings);
        List<String> stringList=new ArrayList<String>();
        while (iteratorArray.hasNext()) {
            stringList.add(iteratorArray.next());
        }
        assertThat(stringList,hasSize(1));
        assertThat(stringList,contains("a"));
    }



}
