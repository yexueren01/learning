package com.twogrit.learning.design_pattern.combination_iterator;

import java.util.Iterator;

public class  IteratorArray<E> implements Iterator {
    E[] objects;
    int nextIndex;

    public IteratorArray(E[] objects) {
        this.objects = objects;
    }

    public boolean hasNext() {
        return nextIndex<objects.length;
    }
    public E next() {
        return objects[nextIndex++];
    }
}
