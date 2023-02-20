package com.softuni.pathfinder.domain.entities;

import com.softuni.pathfinder.domain.enums.Level;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="routes")
public class Route extends BaseEntity {

    @Column(columnDefinition = "LONGTEXT", length = 3000)
    private String gpxCoordinates;//   - Accepts very long text values

    @Enumerated(EnumType.STRING)
    private Level level;//  - Accepts the levels of the routes (BEGINNER, INTERMEDIATE, ADVANCED) as values

    @Column
    private String name;//  - Accepts String values

    @ManyToOne
    private User author;//  - Accepts User Entities as values

    @Column
    private String video;

    @Column
    private String description;

    @OneToMany(targetEntity = Comment.class,
            mappedBy = "route",
           cascade = { CascadeType.MERGE, CascadeType.DETACH})
    private Set<Comment> comments;


    @OneToMany(targetEntity = Picture.class, mappedBy = "route",
             cascade = {CascadeType.MERGE, CascadeType.DETACH} )
    private Set<Picture> pictures;


    @ManyToMany
    private Set<Category> categories;



    public Route() {
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public Route setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public Route setLevel(Level level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public Route setName(String name) {
        this.name = name;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Route setAuthor(User author) {
        this.author = author;
        return this;
    }

    public String getVideo() {
        return video;
    }

    public Route setVideo(String video) {
        this.video = video;
        return this;
    }
}
