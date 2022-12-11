package net.ma.ibtissamCar.car.Api;

import net.ma.ibtissamCar.car.Model.Car;
import net.ma.ibtissamCar.car.Model.TypeCar;
import net.ma.ibtissamCar.car.Repository.CarRepository;
import net.ma.ibtissamCar.car.Repository.TypeCarRepository;
import net.ma.ibtissamCar.core.Api.BaseIbtissamCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/type-car")
public class TypeCarController  extends BaseIbtissamCarController<TypeCar,Long> {

    @Autowired
    public void setRepository(TypeCarRepository repository) {
        this.repository = repository;
    }
}
