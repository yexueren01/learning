package com.twogrit.learning.java8.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class P18Test {
    @Test
    public void shouldGiveSliceOfAList() throws Exception {
        List<String> slice = P18.slice(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3, 7);
        assertThat(slice, hasSize(5));
        assertThat(slice, contains("c", "d", "e", "f", "g"));
    }
}
