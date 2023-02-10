package com.example.springbootintrotest.mobilele.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

import javax.annotation.processing.Generated;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid-string")
    @GenericGenerator(name = "uuid-string", strategy = "org.hibernate.id.uuid.UuidGenerator")
    private String id;

    public BaseEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
