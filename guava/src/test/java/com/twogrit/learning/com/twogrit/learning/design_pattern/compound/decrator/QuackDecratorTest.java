package com.twogrit.learning.com.twogrit.learning.design_pattern.compound.decrator;

import com.twogrit.learning.design_pattern.compound.MallarDuck;
import com.twogrit.learning.design_pattern.compound.QuackAble;
import com.twogrit.learning.design_pattern.compound.decrator.QuackCounterDecrator;
import com.twogrit.learning.design_pattern.compound.decrator.QuackDecrator;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class QuackDecratorTest {
    QuackCounterDecrator quackCounterDecrator=new QuackCounterDecrator(new MallarDuck());
    @Test
    public void testCounter(){
        for (int i=0;i<10;i++)quackCounterDecrator.performQuack();
        assertThat(quackCounterDecrator.quackCount(),equalTo(10));
    }
}
