package com.twogrit.learning.guava.strings;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by kezhang on 17/4/21.
 */
public class MapSplitterTest {

    @Test
    public void splitter() {
        assertThat(Splitter.on("&").withKeyValueSeparator("=").split("id=123&name=green"), equalTo(ImmutableMap.of("id", "123", "name", "green")));
    }

}
