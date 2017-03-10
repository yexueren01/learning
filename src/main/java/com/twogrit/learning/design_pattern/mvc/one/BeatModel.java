package com.twogrit.learning.design_pattern.mvc.one;

import com.google.common.base.Objects;

import java.util.*;

public class BeatModel extends Observable {
    String name;
    String displayName;

    public BeatModel() {
    }

    public BeatModel(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BeatModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add("displayName", this.displayName).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, displayName);
    }

    @Override
    public boolean equals(Object obj) {
     //   Optional<Object> possible = Optional.of(obj);
        if (null == obj || !(obj instanceof BeatModel)) {
            return false;
        }
        return Objects.equal(this.hashCode(), obj.hashCode());
    }
}
