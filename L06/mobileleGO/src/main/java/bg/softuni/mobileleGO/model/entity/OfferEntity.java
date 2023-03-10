package bg.softuni.mobileleGO.model.entity;

import bg.softuni.mobileleGO.model.entity.enums.EngineEnum;
import bg.softuni.mobileleGO.model.entity.enums.TransmissionEnum;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;



import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="offers")
public class OfferEntity {


//    @Id
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "uuid2")
//    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
//    @Type(type = "uuid-char")
//    private UUID id;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "varchar(255)")
//    @Type(type = "uuid-char")
    //TODO: find why it;s not working th ATtype part and i had to use columnDefinition
    public UUID id;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EngineEnum engine;

    private String imageUrl;

    private int mileage;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private TransmissionEnum transmission;         // – enumerated value (MANUAL, AUTOMATIC).

    //private String year;         // – the year of offered car.

    //private String created ;         // – a date and time.

    //private String modified;         // – a date and time.

    @ManyToOne
    private ModelEntity model   ;         // – the model of a car.

    @ManyToOne
    private UserEntity seller  ;         // – a user that sells the car.

    public UUID getId() {
        return id;
    }

    public OfferEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferEntity setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public OfferEntity setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferEntity setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public OfferEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public OfferEntity setSeller(UserEntity seller) {
        this.seller = seller;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "OfferEntity{" +
                "id=" + id +
                ", engine=" + engine +
                ", imageUrl='" + imageUrl + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", transmission=" + transmission +
                ", model=" + model +
                ", seller=" + seller +
                '}';
    }
}

