package com.twogrit.ninetynine_problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P04Test {
    @Test
    public void listOfEmptyListShouldBe0() throws Exception {
        int length = P04.length(Collections.emptyList());
        assertThat(length, is(equalTo(0)));
    }

    @Test
    public void shouldFindListOfNonEmptyList() throws Exception {
        assertThat(P04.length(Arrays.<Object>asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }

}
