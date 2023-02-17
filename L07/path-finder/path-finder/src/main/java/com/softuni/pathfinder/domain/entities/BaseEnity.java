package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEnity {

    @Id
    @GeneratedValue(generator = "uuid-string")
    @GenericGenerator(name = "uuid-string",
    strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    public BaseEnity() {
    }

    public String getId() {
        return this.id;
    }

    public BaseEnity setId(String id) {
        this.id = id;
        return this;
    }
}
