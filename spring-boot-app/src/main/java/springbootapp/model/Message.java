package springbootapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "message", schema = "pre_project_web")
public class Message {

    private Long id;

    @Getter
    @Setter
    private LocalDateTime dateTime;

    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private String sender;

    @Getter
    @Setter
    private String addressee;

    @Setter
    @Getter
    private Picture pic;

    public Message(LocalDateTime dateTime, String text, String sender, String addressee) {
        this.dateTime = dateTime;
        this.text = text;
        this.sender = sender;
        this.addressee = addressee;
    }

    public Message() {

    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    //date
    //text
    //from
    //to
    //pic
}
