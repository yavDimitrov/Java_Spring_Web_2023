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

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name ="UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
 // @Type (type = "uuid-char")
    private String id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EngineEnum engine;

    private String imageUrl;

    private int mileage;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private TransmissionEnum transmission;         // – enumerated value (MANUAL, AUTOMATIC).

    private String year;         // – the year of offered car.

    private String created ;         // – a date and time.

    private String modified;         // – a date and time.

    @ManyToOne
    private ModelEntity model   ;         // – the model of a car.

    @ManyToOne
    //TODO: update after seller is created!
    private ModelEntity seller  ;         // – a user that sells the car.

}

