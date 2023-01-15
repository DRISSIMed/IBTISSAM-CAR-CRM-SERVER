package net.ma.ibtissamCar.common.Model;

import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.car.Model.RangeCar;
import net.ma.ibtissamCar.core.Model.BaseModel;
import net.ma.ibtissamCar.core.view.ModelView;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment extends BaseModel {
    @Id
    @JsonView(ModelView.SelectView.class)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonView(ModelView.SelectView.class)
    private String comment;

    @JsonView(ModelView.SelectView.class)
    private Date datePublsih;
    @JsonView(ModelView.SelectView.class)
    private Long starsNbr;


    @ManyToOne
    @JoinColumn(name = "range_car_id")
    @JsonView(ModelView.SelectView.class)
    private RangeCar rangeCar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDatePublsih() {
        return datePublsih;
    }

    public void setDatePublsih(Date datePublsih) {
        this.datePublsih = datePublsih;
    }

    public Long getStarsNbr() {
        return starsNbr;
    }

    public void setStarsNbr(Long starsNbr) {
        this.starsNbr = starsNbr;
    }
}
