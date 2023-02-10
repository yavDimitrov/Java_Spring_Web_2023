package com.example.springbootintrotest.testMe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final Animal dog;
    private final Animal cat;

    @Autowired
    public HomeService(Animal dog, Animal cat) {
        this.dog = dog;
        this.dog.makeSound();
        this.cat = cat;
        this.cat.makeSound();
    }
}
