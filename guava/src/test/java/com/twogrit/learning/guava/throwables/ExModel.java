package com.twogrit.learning.guava.throwables;

import com.google.common.base.Objects;

import java.util.Observable;
import java.util.concurrent.ExecutionException;

public class ExModel extends Observable {
    String name;
    String displayName;

    public ExModel() {
    }

    public ExModel(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public String getDisplayName()  throws ExecutionException{

        throw new  ExecutionException("test",new RuntimeException());
    }

    public void setDisplayName(String displayName) {
    }

    public ExModel(String name) {
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
        return Objects.toStringHelper(this).add("name",this.name).add("displayName",this.displayName).toString();
    }
}
