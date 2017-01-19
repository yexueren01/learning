package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.MallarDuck;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MallarDuckTest {
    MallarDuck mallarDuck = new MallarDuck();

    @Test
    public void testPerformQuack() {
        assertThat(mallarDuck.performFly(), equalTo("用翅膀飞起来"));
    }

    @Test
    public void testerformQuack() {
        assertThat(mallarDuck.performQuack(), equalTo("呱呱叫"));
    }


}
