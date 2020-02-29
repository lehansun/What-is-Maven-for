package com.epam.brest.courses.animals.configs;

import com.epam.brest.courses.animals.entities.Cat;
import com.epam.brest.courses.animals.entities.Dog;
import com.epam.brest.courses.animals.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat("Cat-");
        cat.setName(cat.getName() + parrot.getName());
        return cat;
    }

    @Bean
    public Dog getDog() {
        return new Dog("Собака-бин из Спрингового контекста");
    }

    @Bean("parrot-kesha")
    public Parrot getParrot() {
        return new Parrot("Попугай-бин из Спрингового контекста");
    }
}
