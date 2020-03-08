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

        Music music = context.getBean("rockMusic", Music.class);
        System.out.println(music.getSong());

        Music classicMusic = context.getBean("classicMusic", Music.class);



        context.close();
    }
}
