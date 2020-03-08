package com.epam.brest.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicMusic musicList;

    @Autowired
    public MusicPlayer(ClassicMusic music) {
        musicList = music;
    }

    public void playMusic() {
        System.out.println("Playing - " + musicList.getSong());
    }

}
