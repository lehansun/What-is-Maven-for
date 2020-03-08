package com.epam.brest.courses;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {

    @Override
    public String getSong() {
        return "Moon sonata";
    }


    public void init() {
        System.out.println("Classic initialization...");
    }

    public void destruction() {
        System.out.println("Destruction of classic music player...");
    }
}
