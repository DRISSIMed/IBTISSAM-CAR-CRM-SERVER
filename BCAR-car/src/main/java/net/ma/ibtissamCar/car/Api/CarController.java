package net.ma.ibtissamCar.car.Api;

import net.ma.ibtissamCar.car.Model.Car;
import net.ma.ibtissamCar.car.Repository.CarRepository;
import net.ma.ibtissamCar.core.Api.BaseIbtissamCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/car")
public class CarController extends BaseIbtissamCarController<Car,Long> {

    @Autowired
    public void setRepository(CarRepository repository) {
        this.repository = repository;
    }


}
