package com.twogrit.learning.design_pattern.combination_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public List<MenuItem> all(){
        List<MenuItem> menuItemList=new ArrayList<MenuItem>();
        Iterator<MenuItem> pancakeHouseMenuIterator= pancakeHouseMenu.iterator();
        while (pancakeHouseMenuIterator.hasNext()) {
            MenuItem next =  pancakeHouseMenuIterator.next();
            menuItemList.add(next);
        }

        Iterator<MenuItem> dinerMenuIterator=  dinerMenu.iterator();
        while (dinerMenuIterator.hasNext()) {
            MenuItem next =  (MenuItem)dinerMenuIterator.next();
            menuItemList.add(next);
        }
        return menuItemList;
    }

    public List<MenuItem> allVegetarians(){
        List<MenuItem> vegetariansList=new ArrayList<MenuItem>();
        Iterator<MenuItem>  menuItemIterator=   all().iterator();
        while (menuItemIterator.hasNext()) {
            MenuItem next =menuItemIterator.next();
            if(next.isVegetarian()) vegetariansList.add(next);
        }
        return vegetariansList;
    }
}
