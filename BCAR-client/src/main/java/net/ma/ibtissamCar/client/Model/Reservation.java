package net.ma.ibtissamCar.client.Model;

import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.car.Model.RangeCar;
import net.ma.ibtissamCar.core.Model.BaseModel;
import net.ma.ibtissamCar.core.view.ModelView;

import javax.persistence.*;

@Entity
public class Reservation extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ModelView.SelectView.class)
    private Long id;

    @JsonView(ModelView.SelectView.class)
    private String nameComplet;

    @JsonView(ModelView.SelectView.class)
    private String email;

    @JsonView(ModelView.SelectView.class)
    private String phoneNumber;

    @JsonView(ModelView.SelectView.class)
    private Long age;

    @JsonView(ModelView.SelectView.class)
    private Long nbrOfPersons;

    @JsonView(ModelView.SelectView.class)
    private String identityCard;

    @JsonView(ModelView.SelectView.class)
    private String driveLicense;

    @JsonView(ModelView.SelectView.class)
    private Long nbrOfChildrens;

    @JsonView(ModelView.SelectView.class)
    private String country;

    @ManyToOne
    @JoinColumn(name = "range_car_id")
    @JsonView(ModelView.SelectView.class)
    private RangeCar rangeCar;

    public RangeCar getRangeCar() {
        return rangeCar;
    }

    public void setRangeCar(RangeCar rangeCar) {
        this.rangeCar = rangeCar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameComplet() {
        return nameComplet;
    }

    public void setNameComplet(String nameComplet) {
        this.nameComplet = nameComplet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getNbrOfPersons() {
        return nbrOfPersons;
    }

    public void setNbrOfPersons(Long nbrOfPersons) {
        this.nbrOfPersons = nbrOfPersons;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.driveLicense = driveLicense;
    }

    public Long getNbrOfChildrens() {
        return nbrOfChildrens;
    }

    public void setNbrOfChildrens(Long nbrOfChildrens) {
        this.nbrOfChildrens = nbrOfChildrens;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
