package com.twogrit.learning.com.twogrit.learning.design_pattern.mvc.one;

import com.twogrit.learning.design_pattern.mvc.one.BeatModel;
import com.twogrit.learning.design_pattern.mvc.one.BeatView;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BeatObservableTest {
    BeatView beatView;
    BeatModel beatModel;
    @Before
    public  void setUp(){
        beatView =new BeatView();
        beatModel=new BeatModel("origalName");
        beatModel.addObserver(beatView);
    }

    @Test
    public void  viewChangeName(){
        beatModel.setName("changedName");
        assertThat(beatView.name,equalTo("changedName"));
    }
}
