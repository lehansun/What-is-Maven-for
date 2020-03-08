package com.epam.brest.courses;

import org.springframework.stereotype.Component;

@Component
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
