package com.example.springbootintrotest.mobilele.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity{

                                                                // – uuid or number.
    @Column
    private String username;                                    // –  username of the user.
    @Column
    private String password;                                    // – password of the user.
    @Column
    private String firstName;                                   // –  first name of the user.
    @Column
    private String lastName;                                    // –  last name of the user.
    @Column
    private Boolean isActive;                                    // – true OR false.
    @OneToMany
    private List<UserRole> role;                                        // –  user's role (User or Admin).
    @Column
    private String imageUrl;                                    // – a url of user's picture.
    @Column
    private Date created;                                     // – a date and time.
    @Column
    private Date modified;                                    // – a date and time.

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<UserRole> getRole() {
        return role;
    }

    public void setRole(List<UserRole> role) {
        this.role = role;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
