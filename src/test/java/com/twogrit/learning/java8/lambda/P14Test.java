package com.twogrit.learning.java8.lambda;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class P14Test {
    @Test
    public void shouldDuplicateElementsInAList() throws Exception {
        List<String> duplicates = P14.duplicate(asList("a", "b", "c", "d"));
        assertThat(duplicates, hasSize(8));
        assertThat(duplicates, contains("a", "a", "b", "b", "c", "c", "d", "d"));
    }

    @Test
    public void shouldDuplicateTimesElementsInAList() throws Exception {
       List<String> stringList= asList("a", "b", "c");
        List<String> duplicates = P14.duplicate(stringList, 3);
        assertThat(duplicates, hasSize(9));
        assertThat(duplicates, contains("a", "a", "a", "b", "b", "b", "c", "c", "c"));
    }
}
