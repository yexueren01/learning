package com.twogrit.learning.design_pattern.compound;

import com.google.common.base.Joiner;
import com.twogrit.learning.design_pattern.BaseEqual;

public class DefaultFly extends BaseEqual implements  FlyBejavior   {
      protected String flyType;

    public DefaultFly(String flyType) {
        this.flyType = flyType;
    }

    public String fly() {
        return this.flyType;
    }

    @Override
    public String toString(){
        return Joiner.on(".").join(this.getClass().getName(),flyType).toString();
    }

}
