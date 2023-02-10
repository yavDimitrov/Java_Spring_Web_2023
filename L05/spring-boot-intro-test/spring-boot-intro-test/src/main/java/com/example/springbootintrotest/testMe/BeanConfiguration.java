package com.example.springbootintrotest.testMe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

    @Bean(value = "dog")
    public Animal CreateDog() {
        return new Dog();
    }

    @Bean(value = "cat")
    public Animal CreateCat() {
         return new Cat();
    }
}
