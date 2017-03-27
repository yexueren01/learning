package com.twogrit.learning.design_pattern.mvc.one;

public class BeatChangeNameController  {
    BeatModel beatModel;

    public BeatChangeNameController(BeatModel beatModel) {
        this.beatModel = beatModel;
    }

    public void changeName(String name) {
        beatModel.setName(name);

    }
}
