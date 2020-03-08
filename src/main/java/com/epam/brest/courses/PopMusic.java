package com.epam.brest.courses;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music{
    private List<String> songs = new ArrayList<>(3);

    {
        songs.add("Pop song 1");
        songs.add("Pop song 2");
        songs.add("Pop song 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
