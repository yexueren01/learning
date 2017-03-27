package com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.*;

public class DecoyDuck extends DefaultDuck {
    public DecoyDuck() {
        this.flyBejavior=new FlyNoWay();
        this.quackBejavior=new QuackNoWay();
    }
}
