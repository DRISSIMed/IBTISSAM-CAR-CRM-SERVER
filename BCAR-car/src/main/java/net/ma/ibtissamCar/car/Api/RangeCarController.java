package net.ma.ibtissamCar.car.Api;

import net.ma.ibtissamCar.car.Model.RangeCar;
import net.ma.ibtissamCar.car.Repository.RangeCarRepository;
import net.ma.ibtissamCar.core.Api.BaseIbtissamCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/range-car")
public class RangeCarController extends BaseIbtissamCarController<RangeCar,Long> {
    @Autowired
    public void setRepository(RangeCarRepository repository) {
        this.repository = repository;
    }

    @Autowired
    RangeCarRepository rangeCarRepository;
    @CrossOrigin
    @GetMapping(path="/get/by-gamme/{gamme}")
    public List<RangeCar> getByGamme(@PathVariable String gamme ){
        if(gamme !=null){
            List<RangeCar> resultList=rangeCarRepository.getByGamme(gamme);
            return resultList;
        }
        return null;
    }
}
