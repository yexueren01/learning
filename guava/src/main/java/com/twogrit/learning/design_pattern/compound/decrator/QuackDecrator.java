package com.twogrit.learning.design_pattern.compound.decrator;

import com.twogrit.learning.design_pattern.compound.Duck;
import com.twogrit.learning.design_pattern.compound.QuackAble;

public  class QuackDecrator implements QuackAble {
    QuackAble quackAble;

    public QuackDecrator(QuackAble quackAble) {
        this.quackAble = quackAble;
    }

    public String performQuack() {
        return quackAble.performQuack();
    }

}
