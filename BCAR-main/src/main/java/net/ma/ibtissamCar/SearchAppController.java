package net.ma.ibtissamCar;

import net.ma.ibtissamCar.car.Model.RangeCar;
import net.ma.ibtissamCar.car.Repository.RangeCarRepository;
import net.ma.ibtissamCar.common.Model.Comment;
import net.ma.ibtissamCar.common.Repository.CommentRepository;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ranges.Range;

import java.util.List;

@RestController
@RequestMapping(path="/search")
public class SearchAppController {
    @Autowired
    RangeCarRepository rangeCarRepository;
    @CrossOrigin
    @GetMapping(path="/get/avialable")
    public List<?> getAvialableCar(@RequestParam String type ){
         if(type !=null && type.equals("car")){
             List<RangeCar> resultList=rangeCarRepository.avialableCars();
             System.out.print("Im inside the condition ");
             return resultList;
         }
       return null;
    }
}
