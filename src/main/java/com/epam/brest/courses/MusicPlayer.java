package com.epam.brest.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicMusic") Music music2,
                       @Qualifier("popMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(MusicGenre genre) {

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (genre) {
            case ROCK :
                return  music1.getSongs().get(randomNumber);
            case CLASSIC :
                return music2.getSongs().get(randomNumber);
            case POP :
                return music3.getSongs().get(randomNumber);
        }
        return null;
    }

}
