package com.example.springbootintrotest.mobilele.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {


    //      private String id;              // – uuid or number.
    private String name;                // – a model name.
    private ModelCategory category;                //– an enumeration (Car, Buss, Truck, Motorcycle)
    private String imageUrl;                // – the url of image with size between 8 and 512 characters.
    private String startYear;               // – a number.
    private String endYear;                 // – a number.
    private String created;                 // – a date and time.
    private String modified;                // – a date and time.
    private String brand;               // – a model brand.

}
