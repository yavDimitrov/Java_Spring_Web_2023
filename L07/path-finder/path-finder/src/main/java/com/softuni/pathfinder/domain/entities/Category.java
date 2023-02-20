package com.softuni.pathfinder.domain.entities;

import com.softuni.pathfinder.domain.enums.CategoryName;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

        @Enumerated(EnumType.STRING)
        private CategoryName name; // - Accepts String values (PEDESTRIAN, BICYCLE, MOTORCYCLE, CAR)

        @Column(columnDefinition = "TEXT")
        private String description; // - Accepts very long String values

        public Category() {
        }

        public CategoryName getName() {
                return name;
        }

        public Category setName(CategoryName name) {
                this.name = name;
                return this;
        }

        public String getDescription() {
                return description;
        }

        public Category setDescription(String description) {
                this.description = description;
                return this;
        }
}
