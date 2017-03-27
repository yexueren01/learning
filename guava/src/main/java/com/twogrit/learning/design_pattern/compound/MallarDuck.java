package com.twogrit.learning.design_pattern.compound;

public class MallarDuck extends DefaultDuck {
    public MallarDuck() {
        this.quackBejavior = new Quack();
        this.flyBejavior =new FlyWithWings();
    }
}
