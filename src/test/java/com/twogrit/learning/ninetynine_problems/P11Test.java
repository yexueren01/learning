package com.twogrit.learning.ninetynine_problems;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;


import static java.util.AbstractMap.*;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class P11Test {
    @Test
    public void shouldEncodeAList() throws Exception {
        List<Object> encodedList = P11.encode_modified(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(encodedList, hasSize(6));
        assertThat((SimpleEntry) encodedList.get(0), equalTo(new SimpleEntry(4, "a")));
        assertThat((String) encodedList.get(1), equalTo("b"));
        assertThat((SimpleEntry) encodedList.get(2), equalTo(new SimpleEntry(2, "c")));
        assertThat((SimpleEntry) encodedList.get(3), equalTo(new SimpleEntry(2, "a")));
        assertThat((String) encodedList.get(4), equalTo("d"));
        assertThat((SimpleEntry) encodedList.get(5), equalTo(new SimpleEntry(4, "e")));
    }
}
