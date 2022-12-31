package com.example.w05_kafeteria;

public class Snacks {
    private String name;
    private String description;
    private int imageResourceId;
    private double price;

    public static final Snacks[] snacks = {
            new Snacks("Sałatka gyros", "Sałatka gyros to popularne danie kuchni greckiej, składające się z kolorowych warzyw,\n"
                    +" kawałków grillowanego mięsa (zazwyczaj cielęcego lub baraninego) oraz sosu tzatziki. Sałatka ta podawana jest zazwyczaj z plackiem pita lub na sałatce z rukolą.\n"
                    +" Jest to lekkie i zdrowe danie, które doskonale nadaje się na obiad lub kolację. Sałatka gyros jest uwielbiana za swój intensywny smak i połączenie klasycznych składników greckiej kuchni.\n"
                    +" Można ją również uzupełnić o dodatkowe składniki, takie jak kiełki fasoli, cebula lub papryka.",
                    R.drawable.salatkagyros, 18.0),
            new Snacks("Pizzerinki", "Pizzerinki to małe, cienkie placki z ciasta podobnego do ciasta na pizzę, które są przekładane różnymi składnikami i pieczone w piekarniku.\n"
                    +" Można je podawać na ciepło lub na zimno jako przekąskę lub danie główne. Są lubiane zarówno przez dzieci, jak i dorosłych i są łatwe do przygotowania w domu.",
                    R.drawable.pizzerinki_3, 25.2),
            new Snacks("Kuleczki ziemniaczane", "Kuleczki ziemniaczane to małe, okrągłe kulki ziemniaczane, które są często panierowane i smażone na głębokim tłuszczu.\n"
                    +" Można je podawać jako przystawkę lub dodatek do głównych dań, a także jako samodzielne danie z dipem lub sosem. Są lubiane zarówno przez dzieci,\n"
                    +" jak i dorosłych i są łatwe do przygotowania w domu.", R.drawable.kuleczkiziemniaczane, 16.7)
    };

    private Snacks(String name, String description, int imageResourceId, double price) {
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

    public double getPrice() { return price; }

    public String toString() {
        return this.name;
    }

}
