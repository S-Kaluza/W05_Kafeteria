package com.example.w05_kafeteria;

public class Drink {
    private final String name;
    private final String description;
    private final int imageResourceId;
    private  final  double price;

    public static final Drink[] drinks = {
            new Drink("Latte", "Latte to popularny napój kawowy składający się z mleka i espresso.\n"
                    +" Jest to idealny napój dla osób, które lubią smak kawy, ale nie chcą pić jej w czystej postaci.\n"
                    +" Napój ten przygotowywany jest poprzez wlanie espresso do filiżanki i zalewanie go podgrzanym mlekiem.\n"
                    +" Może być dekorowany cukrem pudrem lub kakao. Latte jest również często podawane w specjalnie wzorowanych filiżankach o wysokim kształcie,\n"
                    +" co umożliwia tworzenie wzorów i rysunków z mleka na powierzchni napoju. Latte jest idealnym napojem na poranki lub na odpoczynek w ciągu dnia.",
                    R.drawable.latte, 9.0),
            new Drink("Cappuccino", "Cappuccino to tradycyjny włoski napój kawowy składający się z espresso, spienionego mleka i cienkiej warstwy mlecznej piany.\n"
                    +" Napój ten podawany jest zazwyczaj w specjalnie wzorowanej filiżance o niskim kształcie i dekorowany cienką warstwą kakao lub cukru pudru.\n"
                    +" Cappuccino jest idealnym wyborem dla osób, które lubią delikatny smak kawy z dodatkiem mleka. Można go pić rano lub w ciągu dnia jako przekąskę.",
                    R.drawable.cappuccino, 7.5),
            new Drink("Espresso", "Espresso to krótki, intensywny napój kawowy przygotowywany z mielonych ziaren kawy, przez które przepływa gorąca woda pod ciśnieniem.\n"
                    +" Napój ten jest podawany zazwyczaj w specjalnych filiżankach o niskim kształcie i jest charakterystyczny dla włoskiej kawy. Espresso jest uważane za bazę wielu innych napojów kawowych,\n"
                    +" takich jak latte czy cappuccino. Ma intensywny smak i aromat, a także zawiera więcej kofeiny niż zwykła kawa. Espresso jest idealnym wyborem dla osób,\n"
                    +" które lubią silny smak kawy i potrzebują dodatkowego zastrzyku energii.", R.drawable.filter, 7.0)
    };

    private Drink(String name, String description, int imageResourceId, double price) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.price = price;
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

    public String toString() { return this.name; }

    public Double getPrice() { return this.price; };

}
