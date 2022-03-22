package springbootapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
public class Ad {

    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private Picture pic;

    @Getter
    @Setter
    private LocalDateTime date;

    @Getter
    @Setter
    private String contacts;

    public Ad(String name, String text, LocalDateTime date, String contacts) {
        this.name = name;
        this.text = text;
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
