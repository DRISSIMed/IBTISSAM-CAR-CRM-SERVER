package net.ma.ibtissamCar.core.Repository;

import net.ma.ibtissamCar.core.Model.BaseModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface  CustomJPARepository<T, ID > extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>{
    /**
     * This function is used to refresh an updated or newly created entity

     * @param T
     */


}
