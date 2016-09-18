package com.twogrit.learning.design_pattern;

public abstract class BaseEqual implements  Comparable<BaseEqual> {

    public abstract String toString();
    public int compareTo(BaseEqual o) {
        return  this.toString().compareTo(o.toString());
    }

    public boolean equals(BaseEqual obj) {
        return  this.getClass().equals(obj.getClass())&&this.toString().equals(obj.toString());
    }
}
