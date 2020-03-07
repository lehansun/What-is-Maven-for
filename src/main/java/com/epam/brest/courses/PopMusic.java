package com.epam.brest.courses;

public class PopMusic implements Music{

    @Override
    public String getSong() {
        return "Some pop song";
    }

    public void init() {
        System.out.println("POP initialization...");
    }

    public void destruction() {
        System.out.println("Destruction of pop music player...");
    }
}
