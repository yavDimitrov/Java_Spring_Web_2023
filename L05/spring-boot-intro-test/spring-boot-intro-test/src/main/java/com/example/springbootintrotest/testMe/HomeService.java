package com.example.springbootintrotest.testMe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final Animal dog;

    @Autowired
    public HomeService(Animal dog) {
        this.dog = dog;
        this.dog.makeSound();
    }
}
