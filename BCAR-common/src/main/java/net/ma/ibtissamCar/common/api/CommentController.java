package net.ma.ibtissamCar.common.api;

import net.ma.ibtissamCar.common.Model.Comment;
import net.ma.ibtissamCar.core.Api.BaseIbtissamCarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ma.ibtissamCar.common.Repository.CommentRepository;

import java.util.List;

@RestController
@RequestMapping(path="/comment")
public class CommentController extends BaseIbtissamCarController<Comment,Long> {
    @Autowired
    public void setRepository(CommentRepository repository) {
        this.repository = repository;
    }
    @Autowired
    CommentRepository repositoryComment;
    @CrossOrigin
    @GetMapping(path="/get/comment/{id}")
    public List<Comment> getCommentCar(@PathVariable("id") Long id,@RequestParam String object){
        if(object.equals("car")){
            List<Comment> listCommentCar=this.repositoryComment.getCommentByCar(id);
            for (Comment elm:listCommentCar) {
                System.out.print("Comment ==>"+elm.getComment());

            }
            return listCommentCar;

        }
        if(object.equals("appartement")){
            List<Comment> listCommentAppartement=this.repositoryComment.getCommentByAppartement(id);
            for (Comment elm:listCommentAppartement) {
                System.out.print("Comment ==>"+elm.getComment());

            }
            return listCommentAppartement;

        }
      return null;
    }

}
