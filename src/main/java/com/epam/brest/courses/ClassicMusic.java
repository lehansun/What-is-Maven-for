package com.epam.brest.courses;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.*;

import java.util.ArrayList;
import java.util.List;


public class ClassicMusic implements Music {
    private List<String> songs = new ArrayList<>(3);

    @PostConstruct
    public void init() {
        System.out.println("Initialization...");
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @PreDestroy
    public void destruct() {
        System.out.println("Destruction...");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
