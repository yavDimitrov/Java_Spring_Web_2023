package com.softuni.pathfinder.domain.entities;

import com.softuni.pathfinder.domain.enums.Level;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEnity{

    @Column(nullable = false)
    private String username;
        //- Accepts String values
        //Accepts values, which should be at least 2 characters

    @Column(nullable = false)
    private String password;
        //- Accepts String values
        //Accepts values, which should be at least 2 characters

    @Column(nullable = false)
    private String email;
        //- Accepts String values
        //Accepts values, which contain the '@' symbol

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> role;
        //- Accepts Role Entity values
        //Each registered user should have a "User" role

    @Enumerated(EnumType.STRING)
    private Level level;
        //- Accepts a level of the user (BEGINNER, INTERMEDIATE, ADVANCED)


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<Role> getRole() {
        return role;
    }

    public User setRole(Set<Role> role) {
        this.role = role;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public User setLevel(Level level) {
        this.level = level;
        return this;
    }
}
