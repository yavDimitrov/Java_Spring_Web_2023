package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid-string")
    @GenericGenerator(name = "uuid-string",
    strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    public BaseEntity() {
    }

    public String getId() {
        return this.id;
    }

    public BaseEntity setId(String id) {
        this.id = id;
        return this;
    }
}
