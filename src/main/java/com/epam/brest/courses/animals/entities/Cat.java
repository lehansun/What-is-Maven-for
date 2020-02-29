package com.epam.brest.courses.animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        this.name = "Bean-cat";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
