package com.epam.brest.courses.animals.entities;

import org.springframework.stereotype.Component;

@Component("parrot-kesha")
public class Parrot {
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public Parrot() {
        this.name = "Bean-parrot-kesha";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
