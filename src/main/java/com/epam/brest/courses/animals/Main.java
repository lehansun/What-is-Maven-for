package com.epam.brest.courses.animals;

import com.epam.brest.courses.animals.configs.MyConfig;
import com.epam.brest.courses.animals.entities.Cat;
import com.epam.brest.courses.animals.entities.Dog;
import com.epam.brest.courses.animals.entities.Parrot;
import com.epam.brest.courses.animals.entities.dayOfWeak.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("getDog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);
        WeekDay weekDay = context.getBean(WeekDay.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
        System.out.println(weekDay.getWeekDayName());
    }

}
