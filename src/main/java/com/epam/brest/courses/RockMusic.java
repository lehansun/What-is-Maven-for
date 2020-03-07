package com.epam.brest.courses;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind of Change";
    }

    public void init() {
        System.out.println("Rock initialization...");
    }

    public void destruction() {
        System.out.println("Rock destruction...");
    }
}
