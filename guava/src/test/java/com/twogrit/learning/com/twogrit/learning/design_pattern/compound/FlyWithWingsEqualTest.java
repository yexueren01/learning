package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.FlyNoWay;
import com.twogrit.learning.design_pattern.compound.FlyWithWings;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;

public class FlyWithWingsEqualTest {
    FlyWithWings flyWithWings = new FlyWithWings();
    FlyWithWings flyWithWings01 = new FlyWithWings();
    FlyNoWay flyNoWay = new FlyNoWay();

    @Test
    public void testEqual() {
        Assert.assertThat(flyWithWings.equals(flyWithWings01), equalTo(true));
    }

    @Test
    public void testToString() {
        Assert.assertThat("com.twogrit.learning.design_pattern.compound.FlyWithWings.用翅膀飞起来", equalTo(flyWithWings.toString()));
    }

    @Test
    public void testCompareTo() {
        Assert.assertThat(flyWithWings.compareTo(flyWithWings01), equalTo(0));
    }

    @Test
    public void shouldNotEqualWhenClassIsNotSame() {
        assertFalse(flyWithWings.equals(flyNoWay));
    }


}
