package com.epam.brest.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    private Music popMusic;

    @Autowired
    @Qualifier("classicMusic")
    private Music music;


    public String playMusic() {
        return "Playing - " + popMusic.getSong() + ", next: " + music.getSong();
    }

}
