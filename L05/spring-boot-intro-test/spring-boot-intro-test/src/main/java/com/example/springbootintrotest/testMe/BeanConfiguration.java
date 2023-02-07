package com.example.springbootintrotest.testMe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Animal dog() {
        return new Dog();
    }

    @Bean
    public Animal cat() {
         return new Cat();
    }
}
