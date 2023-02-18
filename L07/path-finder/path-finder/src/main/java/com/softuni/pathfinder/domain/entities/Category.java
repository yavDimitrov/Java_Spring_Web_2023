package com.softuni.pathfinder.domain.entities;

import com.softuni.pathfinder.domain.enums.CategoryName;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEnity {

        @Enumerated(EnumType.STRING)
        private CategoryName name; // - Accepts String values (PEDESTRIAN, BICYCLE, MOTORCYCLE, CAR)

        @Column(columnDefinition = "TEXT")
        private String description; // - Accepts very long String values
}
