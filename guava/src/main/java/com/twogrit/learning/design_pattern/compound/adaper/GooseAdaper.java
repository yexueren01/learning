package com.twogrit.learning.design_pattern.compound.adaper;

import com.twogrit.learning.design_pattern.compound.DefaultDuck;
import com.twogrit.learning.design_pattern.compound.FlyNoWay;
import com.twogrit.learning.design_pattern.compound.Goose;

public class GooseAdaper extends DefaultDuck {
    public Goose goose;

    public GooseAdaper(Goose goose) {
        this.goose = goose;
        this.flyBejavior=new FlyNoWay();
    }
    public String performFly() {
        return flyBejavior.fly();
    }

    public String performQuack() {
        return goose.honk();
    }

}
