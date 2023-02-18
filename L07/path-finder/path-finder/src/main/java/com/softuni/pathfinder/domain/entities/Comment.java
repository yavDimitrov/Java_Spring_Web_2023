package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment extends BaseEnity{

    @Column
    private Boolean approved;
            // - Accepts boolean values

    @Column
    private LocalDateTime created;
            // - Accepts Date and Time values. The values should not be future dates

    @Column(columnDefinition = "TEXT", name = "text_content")
    private String text;
            // - Accepts very long text values

    @ManyToOne
    private User author;
            // - Accepts User Entities as values

    @ManyToOne
    private Route route;
            // - Accepts Route Entities as values


    public Comment() {
    }
}
