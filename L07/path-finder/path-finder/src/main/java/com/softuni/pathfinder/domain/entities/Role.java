package com.softuni.pathfinder.domain.entities;

import com.softuni.pathfinder.domain.enums.RoleNames;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table (name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private RoleNames role;

    public Role() {

    }

    public RoleNames getRole() {
        return role;
    }

    public Role setRole(RoleNames role) {
        this.role = role;
        return this;
    }
}
