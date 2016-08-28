package com.twogrit.learning.com.twogrit.learning.design_pattern.combination_iterator;

import com.twogrit.learning.design_pattern.combination_iterator.MenuItem;
import com.twogrit.learning.design_pattern.combination_iterator.PancakeHouseMenu;

public class PancakeHouseMenuFactory {

    public static PancakeHouseMenu getInstance() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.add(new MenuItem("K&B's pancake breakfast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular pancake breakfast", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("BlueBerry pancakes", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", true, 3.59));
        return pancakeHouseMenu;
    }
}
