package com.twogrit.learning.com.twogrit.learning.design_pattern.compound;

public enum DuckFactoryEnum {
    COUNTERDECRATORFACTORY(new CounterDuckFactory()),DUCKFACTORY(new DuckFactory());
    private AbstractDuctFactory abstractDuctFactory;
    DuckFactoryEnum(AbstractDuctFactory abstractDuctFactory) {
        this.abstractDuctFactory=abstractDuctFactory;
    }

    public AbstractDuctFactory getFactory() {
        return abstractDuctFactory;
    }
}
