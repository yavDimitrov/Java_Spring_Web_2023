package com.example.springbootintrotest.testMe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration_test {

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
