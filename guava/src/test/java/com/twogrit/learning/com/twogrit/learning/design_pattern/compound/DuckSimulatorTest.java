package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.Duck;
import com.twogrit.learning.design_pattern.compound.Goose;
import com.twogrit.learning.design_pattern.compound.adaper.GooseAdaper;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DuckSimulatorTest {
    DuckSimulator duckSimulator = new DuckSimulator();
//    @Test
//    public void test(){
//        assertThat(duckSimulator.all(),hasSize(3));
//    }

    @Test
    public void testCreateDuck() {
        Duck duck = duckSimulator.createDuck(DuckFactoryEnum.COUNTERDECRATORFACTORY, DuckEnum.GOOSE);
        Duck exp=new GooseAdaper(new Goose());
        assertThat(duck.toString(),equalTo(exp.toString()));
      //  assertThat(duck,equalTo(exp));
    }

}
