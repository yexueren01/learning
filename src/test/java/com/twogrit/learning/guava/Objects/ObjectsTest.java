package com.twogrit.learning.guava.Objects;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.twogrit.learning.design_pattern.mvc.one.BeatModel;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by kezhang on 17/3/8.
 */
public class ObjectsTest {

    @Test
    public void test() {
        assertTrue(Objects.equal("a", "a"));
        assertTrue(Objects.equal(null, null));
        assertFalse(Objects.equal("a", null));
    }

    @Test
    public void testToString() {
        BeatModel beatModel = new BeatModel("name", "displayName");
        assertThat(beatModel.toString(), equalTo("ExModel{name=name, displayName=displayName}"));
    }

    @Test
    public void testCompareTo() {
        BeatModel beatModel = new BeatModel("name", "displayName");
        BeatModel beatModel0 = new BeatModel("namea", "displayNamae");
        assertThat(ComparisonChain.start().compare(beatModel.getName(), beatModel0.getName()).compare(beatModel.getDisplayName(), beatModel0.getDisplayName()).result(), equalTo(-1));
    }

}
