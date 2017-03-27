package com.twogrit.learning.design_pattern.combination_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements  Iterable{

    List<MenuItem> menuItemList = new ArrayList<MenuItem>();

    public void add(MenuItem menuItem) {
        this.menuItemList.add(menuItem);
    }

    public List<MenuItem> all() {
        return this.menuItemList;
    }


    public Iterator<MenuItem> iterator() {
        return this.menuItemList.iterator();
    }
}
