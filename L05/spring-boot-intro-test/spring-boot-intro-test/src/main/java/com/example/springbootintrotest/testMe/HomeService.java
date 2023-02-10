package com.example.springbootintrotest.testMe;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    private final Animal dog;
    private final Animal cat;

    private final List<Animal> animals;


    @Autowired
    public HomeService(Animal dog, @Qualifier ("CreateCat") Animal cat, List<Animal>animals) {
        System.out.println("I'm in home!");
        this.animals = animals;
        this.cat = cat;
        this.dog = dog;

    }

    @PostConstruct
    public void postConstruct () {
        System.out.println("I'm in post construct");
        this.cat.makeSound();
        this.dog.makeSound();
        System.out.println("List of animal activities");
        this.animals.forEach(Animal::makeSound);
    }
}
