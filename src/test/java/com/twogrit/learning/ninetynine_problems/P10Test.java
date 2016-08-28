package com.twogrit.learning.ninetynine_problems;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class P10Test {
    @Test
    public void shouldEncodeAList() throws Exception {
        List<AbstractMap.SimpleEntry<Integer, String>> encodedList = P10.encode(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(encodedList, hasSize(6));
        assertThat(encodedList.get(0), is(equalTo(new AbstractMap.SimpleEntry<Integer, String>(4, "a"))));
        assertThat(encodedList.get(1), is(equalTo(new AbstractMap.SimpleEntry<Integer, String>(1, "b"))));
        assertThat(encodedList.get(2), is(equalTo(new AbstractMap.SimpleEntry<Integer, String>(2, "c"))));
        assertThat(encodedList.get(3), is(equalTo(new AbstractMap.SimpleEntry<Integer, String>(2, "a"))));
        assertThat(encodedList.get(4), is(equalTo(new AbstractMap.SimpleEntry<Integer, String>(1, "d"))));
        assertThat(encodedList.get(5), is(equalTo(new AbstractMap.SimpleEntry<Integer, String>(4, "e"))));
    }
}
