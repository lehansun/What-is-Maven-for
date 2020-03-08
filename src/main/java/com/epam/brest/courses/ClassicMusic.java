package com.epam.brest.courses;

public class ClassicMusic implements Music {

    @Override
    public String getSong() {
        return "Moon sonata";
    }

    private ClassicMusic() {

    }

    public static ClassicMusic getInstance() {
        return new ClassicMusic();
    }

    public void init() {
        System.out.println("Classic initialization...");
    }

    public void destruction() {
        System.out.println("Destruction of classic music player...");
    }
}
