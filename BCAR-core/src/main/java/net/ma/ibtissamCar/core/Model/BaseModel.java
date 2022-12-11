package net.ma.ibtissamCar.core.Model;

import com.fasterxml.jackson.annotation.JsonView;
import net.ma.ibtissamCar.core.view.ModelView;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass //Mapped to child entities without creating table
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel implements Serializable {
    @CreatedBy
    @JsonView(ModelView.SelectView.class)
    @Column(updatable = false)
    private String createdBy;

    @CreatedDate
    @JsonView(ModelView.SelectView.class)
    @Column(updatable = false)
    private Date createdDate;

    @LastModifiedBy
    @JsonView(ModelView.FullView.class)
    private String lastModifiedBy;

    @LastModifiedDate
    @JsonView(ModelView.FullView.class)
    private Date lastModifiedDate;

    @JsonView(ModelView.ListView.class)
    private Date lastSynchroDate;

    @JsonView(ModelView.FullView.class)
    private Date lastUserModificationDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getLastSynchroDate() {
        return lastSynchroDate;
    }

    public void setLastSynchroDate(Date lastSynchroDate) {
        this.lastSynchroDate = lastSynchroDate;
    }

    public Date getLastUserModificationDate() {
        return lastUserModificationDate;
    }

    public void setLastUserModificationDate(Date lastUserModificationDate) {
        this.lastUserModificationDate = lastUserModificationDate;
    }
}
