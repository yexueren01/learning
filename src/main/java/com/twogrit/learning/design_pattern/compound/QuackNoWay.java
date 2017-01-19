package com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.BaseEqual;

public class QuackNoWay extends BaseEqual implements QuackBejavior{
    public String quack() {
        return "叫个毛啊";
    }

    @Override
    public String toString() {
        return quack();
    }
}
