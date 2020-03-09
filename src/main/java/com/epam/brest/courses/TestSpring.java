package com.epam.brest.courses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer player = context.getBean(MusicPlayer.class);

        System.out.println(player.playMusic(MusicGenre.CLASSIC));

        Computer comp = context.getBean(Computer.class);
        System.out.println(comp);
        context.close();
    }
}
