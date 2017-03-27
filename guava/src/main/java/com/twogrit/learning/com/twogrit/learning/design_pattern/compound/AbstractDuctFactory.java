package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.Duck;

public abstract  class AbstractDuctFactory {
    public abstract Duck CreateDuck(DuckEnum duckEnum);
}
