package com.example.springbootintrotest.testMe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

    //@Primary
    @Bean(value = "dog")
    // @Scope("prototype")
    public Animal CreateDog() {
        return new Dog();
    }

    @Bean
    public Animal CreateCat() {
         return new Cat();
    }
}
