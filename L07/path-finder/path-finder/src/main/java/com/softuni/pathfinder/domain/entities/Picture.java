package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pictures")
public class Picture extends BaseEnity{


    @Column
    private String title; // Accepts String values

    @Column(columnDefinition = "TEXT")
    private String url; // Accepts very long String values

    @ManyToOne
    private User author; // Accepts User Entities as values

    @ManyToOne
    private Route route; // Accepts Route Entities as values

    public Picture() {
    }

    public String getTitle() {
        return title;
    }

    public Picture setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Picture setUrl(String url) {
        this.url = url;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Picture setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public Picture setRoute(Route route) {
        this.route = route;
        return this;
    }
}




