package net.ma.ibtissamCar.car.Model;

import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.core.Model.BaseModel;
import net.ma.ibtissamCar.core.view.ModelView;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RangeCar extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ModelView.SelectView.class)
    private Long id;

    @JsonView(ModelView.SelectView.class)
    private String libelle;


    @JsonView(ModelView.SelectView.class)
    private String code;

    @JsonView(ModelView.SelectView.class)
    private String fuel;

    @JsonView(ModelView.SelectView.class)
    private String picture;
    @JsonView(ModelView.SelectView.class)
    private Float price;
    @JsonView(ModelView.SelectView.class)
    private Float speed;

    @JsonView(ModelView.SelectView.class)
    private Long capacity;


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

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
