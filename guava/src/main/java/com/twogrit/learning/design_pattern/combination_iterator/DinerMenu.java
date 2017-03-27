package com.twogrit.learning.design_pattern.combination_iterator;

import java.util.Iterator;

public class DinerMenu implements  Iterable{
    int numberOfItems=0;
    int MAXNUMBER=10;
    MenuItem[] menuItems=new MenuItem[MAXNUMBER];

    public DinerMenu(MenuItem[] menuItems) {
        if(menuItems.length>MAXNUMBER){
            throw  new RuntimeException("The menu is full and can not be added.");
        }
        this.menuItems = menuItems;
    }

    public     MenuItem[]      all() {
        return this.menuItems;
    }

    public Iterator iterator() {
        return new IteratorArray(menuItems);
    }
}
