package bg.softuni.mobileleGO.model.entity;


import bg.softuni.mobileleGO.model.entity.enums.CategoryEnum;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @OneToMany(
            mappedBy = "brand",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private List<ModelEntity> models = new ArrayList<>();

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "BrandEntity{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }

    public List<ModelEntity> getModels() {
        return models;
    }

    public BrandEntity setModels(List<ModelEntity> models) {
        this.models = models;
        return this;
    }
}
