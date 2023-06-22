package net.ma.ibtissamCar.appartement.Api;

import net.ma.ibtissamCar.appartement.Model.Appartement;
import net.ma.ibtissamCar.appartement.Repository.AppartementRepository;
import net.ma.ibtissamCar.core.Api.BaseIbtissamCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/appartement")
public class AppartementController extends BaseIbtissamCarController<Appartement,Long> {
    @Autowired
    public void setRepository(AppartementRepository repository) {
        this.repository = repository;
    }
}
