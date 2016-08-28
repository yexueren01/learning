package com.twogrit.learning.com.twogrit.learning.design_pattern.combination_iterator;

import com.twogrit.learning.design_pattern.combination_iterator.MenuItem;
import com.twogrit.learning.design_pattern.combination_iterator.Waitress;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class WaitressTest {
    Waitress waitress = new Waitress(DinerMenuFactory.getInstance(), PancakeHouseMenuFactory.getInstance());

    @Test
    public void all() {
        List<MenuItem> menuItemList = waitress.all();
        assertThat(menuItemList, hasSize(8));
    }

    @Test
    public void allVegetarians() {
        List<MenuItem> allVegetariansMenuItemList = waitress.allVegetarians();
        assertThat(allVegetariansMenuItemList, hasSize(4));
    }

}
