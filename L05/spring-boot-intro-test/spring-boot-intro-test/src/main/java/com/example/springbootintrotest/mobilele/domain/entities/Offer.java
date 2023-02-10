package com.example.springbootintrotest.mobilele.domain.entities;

import com.example.springbootintrotest.mobilele.domain.enums.Engine;
import com.example.springbootintrotest.mobilele.domain.enums.Transmission;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column                                                                               // – uuid or number.
    private String description;                                                       // – some text.

    @Enumerated(EnumType.STRING)
    private Engine engine;                                                             // – enumerated value (GASOLINE, DIESEL, ELECTRIC, HYBRID).

    @Column
    private String imageUrl;                                                        // – the url of image.

    @Column
    private Integer mileage;                                                          // – a number.

    @Column
    private String price;                                                               // – the price of the offer.

    @Enumerated(EnumType.STRING)
    private Transmission transmission;                                                  // – enumerated value (MANUAL, AUTOMATIC).

    @Column
    private String year;                                                            // – the year of offered car.

    @Column
    private Date created;                                                         // – a date and time.

    @Column
    private Date modified;                                                        // – a date and time.

    @ManyToOne
    private Model model;                                                            // – the model of a car.

    @ManyToOne
    private User seller;                                                          // – a user that sells the car.


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
}
