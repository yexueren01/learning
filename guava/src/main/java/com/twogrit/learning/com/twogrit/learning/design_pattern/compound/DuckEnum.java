package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.Duck;
import com.twogrit.learning.design_pattern.compound.Goose;
import com.twogrit.learning.design_pattern.compound.adaper.GooseAdaper;

public enum DuckEnum {
    GOOSE(new GooseAdaper(new Goose()));
    Duck duck;

    DuckEnum(Duck duck) {
        this.duck = duck;
    }

    public Duck getDuck() {
        return duck;
    }
}
