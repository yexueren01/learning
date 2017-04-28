package com.twogrit.learning.guava.strings;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.function.Consumer;

/**
 * Created by kezhang on 17/4/21.
 */
public class SplitterTest {

    @Test
    public void split() {
        Splitter.on(".").split("a.B.c.d").forEach(new Consumer<String>() {

            @Override
            public void accept(String o) {
                System.out.println(o);
            }

        });
    }
}
