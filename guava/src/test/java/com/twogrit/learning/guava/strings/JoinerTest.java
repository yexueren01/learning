package com.twogrit.learning.guava.strings;

import com.google.common.base.Joiner;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/4/21.
 */
public class JoinerTest {

    @Test
    public void j(){
        assertThat(Joiner.on(",").skipNulls().join("0",null,"1",null,2),equalTo("0,1,2"));
        assertThat(Joiner.on(",").useForNull("null").join("0",null,"1",null,2),equalTo("0,null,1,null,2"));

    }


}
