package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.Goose;
import com.twogrit.learning.design_pattern.compound.adaper.GooseAdaper;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GooseAdaperTest {
    GooseAdaper gooseAdaper=new GooseAdaper(new Goose());
    @Test
    public  void test(){
        assertThat(gooseAdaper.performQuack(),equalTo("honk"));
    }
}
