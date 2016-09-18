package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.DecoyDuck;
import com.twogrit.learning.design_pattern.compound.Rock;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DecoyDuckTest {
    DecoyDuck decoyDuck = new DecoyDuck();

    @Test
    public void testPerformQuack() {
        assertThat(decoyDuck.performQuack(), equalTo("�и�ë��"));
    }

    @Test
    public void testPerformFly() {
        assertThat(decoyDuck.performFly(), equalTo("�ɸ�ë��"));
    }

    @Test
    public void testPerFormFlyWhenSetRock(){
        decoyDuck.setFlyBejavior(new Rock());
        assertThat(decoyDuck.performFly(), equalTo("������ҷ�"));
    }

}
