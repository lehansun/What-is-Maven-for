package com.epam.brest.courses;

public class MusicPlayer {
    private Music music;

    // При помощи полиморфизма и конструктора реализуется инверсия контроля IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing - " + music.getSong());
    }
}
