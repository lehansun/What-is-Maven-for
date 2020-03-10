package com.epam.brest.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {

        Random random = new Random();
        int randomNumber = random.nextInt(musicList.size());
        Music musicToPlay = musicList.get(randomNumber);
        for (String song : musicToPlay.getSongs()) {
            System.out.println(getName() + " playing " + song + ", volume = " + getVolume());
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
