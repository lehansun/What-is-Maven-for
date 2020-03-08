package com.epam.brest.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicMusic musicList;

    @Autowired
    public MusicPlayer(ClassicMusic music) {
        musicList = music;
    }

    public String playMusic() {
        return "Playing - " + musicList.getSong();
    }

}
