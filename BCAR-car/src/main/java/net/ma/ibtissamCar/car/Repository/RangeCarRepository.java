package net.ma.ibtissamCar.car.Repository;
import net.ma.ibtissamCar.car.Model.RangeCar;
import net.ma.ibtissamCar.core.Repository.CustomJPARepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RangeCarRepository  extends CustomJPARepository<RangeCar,Long> {
    @Query("select c from  RangeCar c where c.isReserved is null ")
    List<RangeCar> avialableCars();
}
