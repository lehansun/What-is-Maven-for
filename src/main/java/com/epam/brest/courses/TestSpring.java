package com.epam.brest.courses;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // Доступ к классу ClassPathXmlApplicationContext мы получили благодаря подключению зависимости springframework
        // Он обращается к файлу applicationContext.xml, считывает его и помечает все классы,
        // которые будут помещены в context в качестве бинов

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("popBean", PopMusic.class);
        System.out.println(music.getSong());

        Music music2 = context.getBean("popBean", PopMusic.class);

        Music music3 = context.getBean("popBean", PopMusic.class);


//        // Music testBean = context.getBean("musicBean",Music.class);
//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();
//        player.setName("First player");
//        secondPlayer.playMusic();
//        System.out.println(player.getName());
//        System.out.println(secondPlayer.getName());

        context.close();
    }
}
