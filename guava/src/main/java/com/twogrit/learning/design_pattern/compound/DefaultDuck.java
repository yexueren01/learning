package com.twogrit.learning.design_pattern.compound;

import com.google.common.base.Joiner;
import com.twogrit.learning.design_pattern.BaseEqual;

public class DefaultDuck extends BaseEqual implements Duck   {
    protected FlyBejavior flyBejavior=new FlyNoWay();
    QuackBejavior quackBejavior=new QuackNoWay();

    public String performFly() {
        return flyBejavior.fly();
    }

    public String performQuack() {
        return quackBejavior.quack();
    }

    public FlyBejavior getFlyBejavior() {
        return flyBejavior;
    }

    public void setFlyBejavior(FlyBejavior flyBejavior) {
        this.flyBejavior = flyBejavior;
    }

    public QuackBejavior getQuackBejavior() {
        return quackBejavior;
    }

    public void setQuackBejavior(QuackBejavior quackBejavior) {
        this.quackBejavior = quackBejavior;
    }

    @Override
    public String toString() {
        return Joiner.on(".").join(flyBejavior.toString(),quackBejavior.toString());
    }
}
