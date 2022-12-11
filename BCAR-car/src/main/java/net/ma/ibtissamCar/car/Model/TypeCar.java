package net.ma.ibtissamCar.car.Model;


import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.core.Model.BaseModel;
import net.ma.ibtissamCar.core.view.ModelView;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TypeCar  extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ModelView.SelectView.class)
    private Long id;

    @JsonView(ModelView.SelectView.class)
    private String libelle;

    @JsonView(ModelView.SelectView.class)
    private String code;

    @OneToMany(mappedBy ="typeCar", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JsonView(ModelView.SelectView.class)
    private Set<Car> car;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
