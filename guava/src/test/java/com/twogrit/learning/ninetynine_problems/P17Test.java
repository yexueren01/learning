package com.twogrit.learning.ninetynine_problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class P17Test {
    @Test
    public void shouldSplitInTwoHalves() throws Exception {
        Map<Boolean, List<String>> result = P17.split(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3);
//        assertThat(result.get(true), contains("a", "b", "c"));
//        assertThat(result.get(false), contains("d", "e", "f", "g", "h", "i", "k"));
    }
}
