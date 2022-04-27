package springbootapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table (name = "ad", schema = "pre_project_web")
@Data
public class Ad {

    @Id
    private Long id;
    private String name;
    private String text;
    private Long picId;
    private LocalDateTime date;
    private String contacts;

    public Ad(String name, String text, Long picId, LocalDateTime date, String contacts) {
        this.name = name;
        this.text = text;
        this.picId = picId;
        this.date = date;
        this.contacts = contacts;
    }

    public Ad() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    //date
    //message
    //picture
    //contacts
    //
}
