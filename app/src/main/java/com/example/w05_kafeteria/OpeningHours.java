package com.example.w05_kafeteria;

public class OpeningHours {
    private final String monday;
    private final String tuesday;
    private final String wednesday;
    private final String thursday;
    private final String friday;
    private final String saturday;
    private final String sunday;

    public OpeningHours(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public String getMondayOpeningHours(){
        return this.monday;
    }

    public String getTuesdayOpeningHours(){
        return this.tuesday;
    }

    public String getWednesdayOpeningHours(){
        return this.wednesday;
    }

    public String getThursdayOpeningHours(){
        return this.thursday;
    }

    public String getFridayOpeningHours(){
        return this.friday;
    }

    public String getSaturdayOpeningHours(){
        return this.saturday;
    }

    public String getSundayOpeningHours(){
        return this.sunday;
    }

    public String getOpeningHours() {
        String openingHours = "Pon: " + this.monday
                +"\nWt: " + this.tuesday
                +"\nŚr: " + this.wednesday
                +"\nCzw: " + this.thursday
                +"\nPią: " + this.friday
                +"\nSob: " + this.saturday
                +"\nNied: " + this.sunday;
        return  openingHours;
    }
}
