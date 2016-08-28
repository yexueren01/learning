package com.twogrit.learning.ninetynine_problems;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class P01Test {
    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }
}
