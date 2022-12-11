package net.ma.ibtissamCar.core.Repository;

import net.ma.ibtissamCar.core.Model.BaseModel;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class CustomJPARipositoryImp <T , ID extends Serializable>  extends SimpleJpaRepository<T, ID> implements CustomJPARepository<T, ID> {


    public CustomJPARipositoryImp(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);

    }

    public CustomJPARipositoryImp(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);

    }




}
