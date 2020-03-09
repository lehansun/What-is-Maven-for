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

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer player = context.getBean(MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());

        Music classic1 = context.getBean("classicMusic", ClassicMusic.class);
        Music classic2 = context.getBean("classicMusic", ClassicMusic.class);

        System.out.println(classic1 == classic2);
        context.close();
    }
}
