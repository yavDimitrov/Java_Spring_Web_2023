package com.example.springbootintrotest;

import com.example.springbootintrotest.testMe.Animal;
import com.example.springbootintrotest.testMe.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIntroTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntroTestApplication.class, args);

        @Bean
        public Animal getDog(){
            return new Dog();
        }

    }

}
