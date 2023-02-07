package com.example.springbootintrotest.testMe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final Animal animal;

    @Autowired
    public HomeService(Animal animal) {
        this.animal = animal;
        this.animal.makeSound();
    }
}
