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
    private Float oldPrice;
    @JsonView(ModelView.SelectView.class)
    private Float speed;

    @JsonView(ModelView.SelectView.class)
    private Long capacity;

    @JsonView(ModelView.SelectView.class)
    private Boolean isReserved;

    @JsonView(ModelView.SelectView.class)
    private String colorOne;
    @JsonView(ModelView.SelectView.class)
    private String colorTwo;
    @JsonView(ModelView.SelectView.class)
    private String colorThree;
    @JsonView(ModelView.SelectView.class)
    private String colorFor;

    @JsonView(ModelView.SelectView.class)
    private String gamme;

    @JsonView(ModelView.SelectView.class)
    private Long qantity;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getGamme() {
        return gamme;
    }

    public void setGamme(String gamme) {
        this.gamme = gamme;
    }

    public Long getQantity() {
        return qantity;
    }

    public void setQantity(Long qantity) {
        this.qantity = qantity;
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

    public Boolean getReserved() {
        return isReserved;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
    }

    public String getColorOne() {
        return colorOne;
    }

    public void setColorOne(String colorOne) {
        this.colorOne = colorOne;
    }

    public String getColorTwo() {
        return colorTwo;
    }

    public void setColorTwo(String colorTwo) {
        this.colorTwo = colorTwo;
    }

    public String getColorThree() {
        return colorThree;
    }

    public void setColorThree(String colorThree) {
        this.colorThree = colorThree;
    }

    public String getColorFor() {
        return colorFor;
    }

    public void setColorFor(String colorFor) {
        this.colorFor = colorFor;
    }

    public Float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Float oldPrice) {
        this.oldPrice = oldPrice;
    }
}
