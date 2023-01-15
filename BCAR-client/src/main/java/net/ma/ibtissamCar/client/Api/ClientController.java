package net.ma.ibtissamCar.client.Api;

import net.ma.ibtissamCar.client.Model.Client;
import net.ma.ibtissamCar.client.Repository.ClientRepository;
import net.ma.ibtissamCar.core.Api.BaseIbtissamCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/client")
public class ClientController extends BaseIbtissamCarController<Client,Long> {

    @Autowired
    public void setRepository(ClientRepository repository) {
        this.repository = repository;
    }
}
