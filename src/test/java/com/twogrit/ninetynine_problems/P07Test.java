package com.twogrit.ninetynine_problems;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class P07Test {

    @Test
    public void shouldFlattenAListOfList() throws Exception {
        List<String> flatten = P07.flatten(asList("a", asList("b", asList("c", "d")), "e"), String.class);
        assertThat(flatten, hasSize(5));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e"));

    }

    @Test
    public void shouldFlattenDeepNestedLists() throws Exception {
        List<String> flatten = P07.flatten(asList("a", asList("b", asList("c", asList("d", "e", asList("f", "g"))), "h")), String.class);
        assertThat(flatten, hasSize(8));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e", "f", "g", "h"));
    }

    @Test
    public void shouldReturnEmptyListWhenTryingToFlattenAnEmptyList() throws Exception {
        List<String> flatten = P07.flatten(Collections.emptyList(), String.class);
        assertTrue(flatten.isEmpty());
    }


}
