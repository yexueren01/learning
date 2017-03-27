package com.twogrit.learning.ninetynine_problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class P03Test {
    @Test
    public void shouldFindKthElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertThat(P03.kth(numbers, 2), is(equalTo(3)));
    }
}
