package com.example.w05_kafeteria;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "Czarne espresso z gorącym mlekiem i mleczną pianką.",
                    R.drawable.latte),
            new Drink("Cappuccino", "Czarne espresso z dużą ilością spienionego mleka.",
                    R.drawable.cappuccino),
            new Drink("Espresso", "Czarna kawa ze świeżo mielonych ziaren najwyższej jakości.", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
