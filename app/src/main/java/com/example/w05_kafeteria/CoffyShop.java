package com.example.w05_kafeteria;
import com.example.w05_kafeteria.OpeningHours;

public class CoffyShop {
    private final String name;
    private final String description;
    private final int imageResourceId;
    private final String city;
    private final String street;
    private final int imageMapResourceId;
    private final String mapAdressURL;
    private final OpeningHours openingHours;


    public static final CoffyShop[] shops = {
            new CoffyShop("Caffe del Corso", "Kawiarnia Caffe del Corso to miejsce, w którym można poczuć atmosferę prawdziwej włoskiej kawiarni.\n"
                    +"Nasza oferta obejmuje szeroki wybór kaw przygotowywanych z wysokiej jakości ziaren oraz smaczne ciasta i przekąski.\n"
                    +"W naszej kawiarni możesz również skosztować różnorodnych herbat i koktajli oraz zamówić lekkie dania na lunch lub obiad.\n"
                    +"Nasz zespół składa się z doświadczonych baristów, którzy z przyjemnością pomogą Ci wybrać coś dla siebie.\n"
                    +"Caffe del Corso to nie tylko miejsce na relaksujące spotkanie z przyjaciółmi, ale także idealne miejsce na biznesowe spotkania czy romantyczne randki.\n"
                    +"Serdecznie zapraszamy do odwiedzenia naszej kawiarni!", "Częstochowa", "ANMP 59", R.drawable.del_corso_map,R.drawable.del_corso_image, new OpeningHours("7:30 - 22:00", "7:30 - 22:00", "7:30 - 22:00", "7:30 - 22:00", "7:30 - 23:00", "10:00 - 23:00", "10:00 - 22:00"), "https://goo.gl/maps/wogLxWZHEFbWQZKQ7"),
            new CoffyShop("Sweet Home Cafe &", "Sweet Home & Cafe' to miejsce, w którym możesz zarówno wypić filiżankę smacznej kawy, owocową herbatę, gorącą czekoladę, zjeść coś słodkiego czy kupić przedmiot, który Ci się spodobał.\n" +
                    "Sweet Home & Cafe' powstał z myślą o ludziach, dla których liczy się smak i dobry gust.\n" +
                    "Wszystkie przedmioty w  Sweet Home & Cafe' są do kupienia - zarówno filiżanka, w której poda", "Częstochowa", "7 Kamienic 11", R.drawable.sweet_home_map, R.drawable.sweet_home_image, new OpeningHours("7:30 - 22:00", "7:30 - 22:00", "7:30 - 22:00", "7:30 - 22:00", "7:30 - 23:00", "10:00 - 23:00", "10:00 - 22:00"), "https://goo.gl/maps/Jj3XuvzhTkhpr2Uw8"),

            new CoffyShop("Adorato Cukiernia i kawiarnia", "Cukiernia i kawiarnia Adorato to miejsce, w którym można zaspokoić swoje chęci na słodkości i pyszne kawy.\n"
                     + "W naszej ofercie znajdziesz szeroki wybór ciast, ciasteczek, ciastek oraz kaw przygotowywanych z wysokiej jakości ziaren.\n"
                     + "Nasz zespół to grupa wykwalifikowanych cukierników i baristów, którzy z przyjemnością pomogą Ci wybrać coś dla siebie.\n"
                    + "W Adorato zawsze zapewniamy nie tylko doskonały smak, ale także eleganckie wykończenie i dekoracje naszych wypieków.\n" + "Serdecznie zapraszamy do odwiedzenia naszej cukierni i kawiarni!", "Częstochowa", "Kiedrzyńska 134", R.drawable.adorato_mapa, R.drawable.adorato_image, new OpeningHours("7:30 - 22:00", "7:30 - 22:00", "7:30 - 22:00", "7:30 - 22:00", "7:30 - 23:00", "10:00 - 23:00", "10:00 - 22:00"), "https://goo.gl/maps/EXqJa1Mjnn39hZPV6")
    };

    private CoffyShop(String name, String description, String city, String street, int imageResourceId, int imageMapResource, OpeningHours openingHours, String mapAdressURL) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.imageMapResourceId = imageMapResource;
        this.city = city;
        this.street = street;
        this.openingHours = openingHours;
        this.mapAdressURL = mapAdressURL;
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

    public int getImageMapResource() {
        return imageMapResourceId;
    }

    public  OpeningHours getOpeningHours() { return  openingHours; }

    public String toString() {
        return this.name;
    }

    public String getAdress() {
        return this.city + " " + this.street;
    }

    public String getMapAdressURL() { return  this.mapAdressURL; }

}
