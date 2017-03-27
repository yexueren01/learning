package com.twogrit.learning.com.twogrit.learning.design_pattern.mvc.one;

import com.twogrit.learning.design_pattern.mvc.one.BeatChangeDisplayNameController;
import com.twogrit.learning.design_pattern.mvc.one.BeatChangeNameController;
import com.twogrit.learning.design_pattern.mvc.one.BeatModel;
import com.twogrit.learning.design_pattern.mvc.one.BeatView;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BeatControllerTest {
    BeatView beatView;
    BeatModel beatModel;
    @Before
    public  void setUp(){
        beatModel=new BeatModel("origalName");
        BeatChangeNameController beatChangeNameController=new BeatChangeNameController(beatModel);
        BeatChangeDisplayNameController beatChangeDisplayNameController=new BeatChangeDisplayNameController(beatModel);
        beatView =new BeatView("defaultName",beatChangeNameController,beatChangeDisplayNameController);
        beatModel.addObserver(beatView);
    }

    @Test
    public void  modelChangeNameTestObservableMV(){
        beatModel.setName("changedName");
        assertThat(beatView.name,equalTo("changedName"));
    }

    @Test
    public void  viewChangeDisplayNametestVCM(){
        beatView.changedDisplayName("changedDisplayName");
        assertThat(beatModel.getDisplayName(),equalTo("changedDisplayName"));
    }

    @Test
    public void  viewChangeNameTestVCMV(){
        beatView.changeName("changedName");
        assertThat(beatModel.getName(),equalTo("changedName"));
        assertThat(beatView.name,equalTo("changedName"));
    }
}
