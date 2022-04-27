package springbootapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "picture", schema = "pre_project_web")
@Embeddable
public class Picture {


    private Long id;

    @Lob
    private byte[] image;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }


}
