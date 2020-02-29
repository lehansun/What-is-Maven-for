package com.epam.brest.courses.animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
        this.name = "Bean-dog";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
