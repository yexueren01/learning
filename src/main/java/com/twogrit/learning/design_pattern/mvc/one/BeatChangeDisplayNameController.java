package com.twogrit.learning.design_pattern.mvc.one;

public class BeatChangeDisplayNameController {
    BeatModel beatModel;

    public BeatChangeDisplayNameController(BeatModel beatModel) {
        this.beatModel = beatModel;
    }

    public void changeDisplayName(String displayName) {
        beatModel.setDisplayName(displayName);
    }
}
