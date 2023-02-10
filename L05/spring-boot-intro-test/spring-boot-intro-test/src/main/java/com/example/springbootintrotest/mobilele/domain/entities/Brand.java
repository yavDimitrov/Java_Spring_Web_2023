package com.example.springbootintrotest.mobilele.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table (name = "brands")
public class Brand extends BaseEntity{

    @Column(unique = true, nullable = false)
     private String name;

    @Column
    private Date created;

    @Column
    private Date modified;


}



