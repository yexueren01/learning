package com.twogrit.learning.design_pattern.compound;

import com.google.common.base.Joiner;
import com.twogrit.learning.design_pattern.BaseEqual;

public class QuackNoWay extends BaseEqual implements QuackBejavior{
    public String quack() {
        return "�и�ë��";
    }

    @Override
    public String toString() {
        return quack();
    }
}
