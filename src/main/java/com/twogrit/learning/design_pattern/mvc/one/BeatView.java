package com.twogrit.learning.design_pattern.mvc.one;

import java.util.Observable;
import java.util.Observer;

public class BeatView    implements Observer {
    public String name;
    BeatChangeNameController beatChangeNameController;
    BeatChangeDisplayNameController beatChangeDisplayNameController;


    public BeatView() {
    }

    public BeatView(String name, BeatChangeNameController beatChangeNameController, BeatChangeDisplayNameController beatChangeDisplayNameController) {
        this.name = name;
        this.beatChangeNameController = beatChangeNameController;
        this.beatChangeDisplayNameController = beatChangeDisplayNameController;
    }

    public void update(Observable o, Object arg) {
        BeatModel beatModel=(BeatModel)o;
        this.name=beatModel.getName();
    }

    public void changeName(String name){
        beatChangeNameController.changeName(name);
    }


    public void changedDisplayName(String displayName) {
        beatChangeDisplayNameController.changeDisplayName(displayName);
    }
}
