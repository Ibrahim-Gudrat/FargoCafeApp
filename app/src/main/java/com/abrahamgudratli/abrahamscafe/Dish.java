package com.abrahamgudratli.abrahamscafe;

public class Dish {

    String title;
    String description;
    int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    Dish(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
