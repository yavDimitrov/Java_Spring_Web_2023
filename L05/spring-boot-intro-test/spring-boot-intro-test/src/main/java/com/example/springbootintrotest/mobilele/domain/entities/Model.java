package com.example.springbootintrotest.mobilele.domain.entities;

import com.example.springbootintrotest.mobilele.domain.enums.ModelCategory;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {


    //      private String id;              // – uuid or number.
    @Column
    private String name;                // – a model name.

    @Enumerated(EnumType.STRING)
    private ModelCategory category;                //– an enumeration (Car, Buss, Truck, Motorcycle)

    @Column
    private String imageUrl;                // – the url of image with size between 8 and 512 characters.

    @Column
    private Integer startYear;               // – a number.

    @Column
    private Integer endYear;                 // – a number.

    @Column
    private Date created;                 // – a date and time.

    @Column
    private Date modified;                // – a date and time.

    @ManyToOne
    private Brand brand;               // – a model brand.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelCategory getCategory() {
        return category;
    }

    public void setCategory(ModelCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
