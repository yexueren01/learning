package com.twogrit.learning.design_pattern.combination_iterator;

public class MenuItem {
    String name;
    boolean vegetarian;
    double price;

    public MenuItem(String name, boolean vegetarian, double price) {
        this.name = name; 
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
