package com.twogrit.ninetynine_problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class P02Test {

    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
        List<Integer> numbers = asList(1, 2, 11, 4, 5, 8, 10, 6);
        assertThat(P02.secondLast(numbers), is(equalTo(10)));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListEmpty() throws Exception {
        P02.secondLast(Collections.<Integer>emptyList());
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListHasSingleElement() throws Exception {
        P02.secondLast(Arrays.asList(1));
    }
}
