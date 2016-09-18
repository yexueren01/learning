package com.twogrit.learning.ninetynine_problems;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class P12Test {
    @Test
    public void shouldDecodeEncodedList() throws Exception {
        List<String> encoded = P12.decode(
                Arrays.asList(
                        new AbstractMap.SimpleEntry(4, "a"),
                        "b",
                        new AbstractMap.SimpleEntry(2, "c"),
                        new AbstractMap.SimpleEntry(2, "a"),
                        "d",
                        new AbstractMap.SimpleEntry(4, "e")));
        assertThat(encoded, hasSize(14));
    }
}
