package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Picture extends BaseEnity{


    @Column
    private String title; // Accepts String values

    @Column
    private String url; // Accepts very long String values

    @ManyToOne
    private User author; // Accepts User Entities as values

    @ManyToOne
    private Route route; // Accepts Route Entities as values



}




