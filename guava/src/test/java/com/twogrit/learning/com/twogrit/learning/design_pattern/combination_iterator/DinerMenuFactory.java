package com.twogrit.learning.com.twogrit.learning.design_pattern.combination_iterator;

import com.twogrit.learning.design_pattern.combination_iterator.DinerMenu;
import com.twogrit.learning.design_pattern.combination_iterator.MenuItem;

public class DinerMenuFactory {

    public static DinerMenu getInstance() {
        MenuItem[] menuItems =new MenuItem[4];
        DinerMenu dinerMenu = new DinerMenu(menuItems);
        menuItems[0]=new MenuItem("vegetarian BTL", true, 2.99);
        menuItems[1]=new MenuItem("BTL", false, 2.99);
        menuItems[2]=new MenuItem("Soup of the day", false, 3.29);
        menuItems[3]=new MenuItem("HotDog", false, 3.05);
        return dinerMenu;
    }
}
