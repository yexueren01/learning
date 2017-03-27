package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.Duck;

public class CounterDuckFactory extends AbstractDuctFactory {
    @Override
    public Duck CreateDuck(DuckEnum duckEnum) {
        return duckEnum.getDuck();
    }
}
