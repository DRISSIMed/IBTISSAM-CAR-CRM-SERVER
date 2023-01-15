package net.ma.ibtissamCar.core.Api;

import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.core.Repository.CustomJPARepository;
import net.ma.ibtissamCar.core.view.ModelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class BaseIbtissamCarController <T,v>{

    public  CustomJPARepository repository;

    @CrossOrigin
    @JsonView(ModelView.ListView.class)
    @GetMapping(path = "/v2/list")
    public List<T> list(){
        List<T> result = (List<T>) this.repository.findAll();
        return result;
    }
    @CrossOrigin
    @JsonView(ModelView.ListView.class)
    @GetMapping(path = "/get/{id}")
    public T getObjectByID(@PathVariable("id") v id){
        T result = (T) this.repository.findById(id);
        return result;
    }
    @CrossOrigin
    @JsonView(ModelView.ListView.class)
    @PostMapping(path = "/create")
    public T create(@RequestBody T object){
        object=(T) this.repository.save(object);
        return object;
    }

    @CrossOrigin
    @JsonView(ModelView.ListView.class)
    @PostMapping(path = "/delete/{id}")
    public List<T> deleteObjectById(@PathVariable("id") v id){
        this.repository.deleteById(id);
        List<T> result = (List<T>) this.repository.findAll();
        return result.stream().collect(Collectors.toList());
    }

}
