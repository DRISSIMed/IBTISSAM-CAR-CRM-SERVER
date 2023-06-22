package net.ma.ibtissamCar.appartement.Model;

import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.core.Model.BaseModel;
import net.ma.ibtissamCar.core.view.ModelView;

import javax.persistence.*;

@Entity
public class Appartement extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ModelView.SelectView.class)
    private Long id;

    @JsonView(ModelView.SelectView.class)
    private String type;

    @JsonView(ModelView.SelectView.class)
    private String libelle;

    @JsonView(ModelView.SelectView.class)
    private Long nbrOfperson;

    @JsonView(ModelView.SelectView.class)
    private String  city;

    @JsonView(ModelView.SelectView.class)
    private String  localisation;

    @JsonView(ModelView.SelectView.class)
    private Float  price;

    @JsonView(ModelView.SelectView.class)
    private String picture;

    @JsonView(ModelView.SelectView.class)
    private Boolean isReserved;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getNbrOfperson() {
        return nbrOfperson;
    }

    public void setNbrOfperson(Long nbrOfperson) {
        this.nbrOfperson = nbrOfperson;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
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
}
