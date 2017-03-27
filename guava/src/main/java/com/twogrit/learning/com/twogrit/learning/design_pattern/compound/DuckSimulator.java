package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

import com.twogrit.learning.design_pattern.compound.Duck;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    List<Duck> duckList = new ArrayList<Duck>();

    public Duck createDuck(DuckFactoryEnum duckFactoryEnum,DuckEnum duckEnum){
        return duckFactoryEnum.getFactory().CreateDuck(duckEnum);
    }
    public List<Duck> all() {
        return duckList;
    }

}
