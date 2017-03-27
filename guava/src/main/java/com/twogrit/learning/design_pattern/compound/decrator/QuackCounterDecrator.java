package com.twogrit.learning.design_pattern.compound.decrator;

import com.twogrit.learning.design_pattern.compound.QuackAble;

public class QuackCounterDecrator extends QuackDecrator {
    private int counts;

    public QuackCounterDecrator(QuackAble quackAble) {
        super(quackAble);
    }

    public String performQuack() {
        counts++;
        return quackAble.performQuack();
    }

    public int quackCount() {
        return counts;
    }
}
