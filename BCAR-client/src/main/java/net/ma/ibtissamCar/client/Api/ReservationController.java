package net.ma.ibtissamCar.client.Api;

import net.ma.ibtissamCar.car.Model.RangeCar;
import net.ma.ibtissamCar.car.Repository.RangeCarRepository;
import net.ma.ibtissamCar.client.Model.Client;
import net.ma.ibtissamCar.client.Model.Reservation;
import net.ma.ibtissamCar.client.Repository.ReservationRepository;
import net.ma.ibtissamCar.core.Api.BaseIbtissamCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/reservation")
public class ReservationController extends BaseIbtissamCarController<Reservation,Long> {
    @Autowired
    public void setRepository(ReservationRepository repository) {
        this.repository = repository;
    }

    @Autowired
    RangeCarRepository rangeCarRepository;

    @CrossOrigin
    @PostMapping(path="/create/v2")
    public ResponseEntity<?> createv2(@RequestBody Reservation reservation){
        RangeCar rangeCar=this.rangeCarRepository.findById(reservation.getRangeCar().getId()).get();
        System.out.print("RANGE ==>"+rangeCar.getLibelle());
        if(rangeCar.getReserved()!=null && rangeCar.getReserved().equals(true) ){
            return ResponseEntity.ok(ResponseEntity.status(402));
        }
        else{
            rangeCar.setReserved(true);
            Reservation result= (Reservation) this.repository.save(reservation);
            return ResponseEntity.ok(result) ;
        }


    }
}
