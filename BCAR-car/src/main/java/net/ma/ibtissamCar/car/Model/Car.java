package net.ma.ibtissamCar.car.Model;

import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.core.Model.BaseModel;
import net.ma.ibtissamCar.core.view.ModelView;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Car extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ModelView.SelectView.class)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "type_car_id")
    @JsonView(ModelView.SelectView.class)
    private TypeCar typeCar;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
