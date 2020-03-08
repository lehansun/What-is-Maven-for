package com.epam.brest.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicPlayer musicPlayer;
    private int id;

    @Autowired
    public Computer(MusicPlayer player) {
        id = 1;
        musicPlayer = player;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
