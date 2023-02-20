package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

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

    public Boolean getApproved() {
        return approved;
    }

    public Comment setApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Comment setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getText() {
        return text;
    }

    public Comment setText(String text) {
        this.text = text;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Comment setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public Comment setRoute(Route route) {
        this.route = route;
        return this;
    }
}
