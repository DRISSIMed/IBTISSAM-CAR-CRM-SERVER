package net.ma.ibtissamCar.common.Repository;

import net.ma.ibtissamCar.common.Model.Comment;
import net.ma.ibtissamCar.core.Repository.CustomJPARepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends CustomJPARepository<Comment,Long> {
    @Query("select c from Comment c where c.rangeCar.id=:id")
    List<Comment> getCommentByCar(@Param("id") Long id);
}
