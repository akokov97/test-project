package springbootapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "message", schema = "pre_project_web")
public class Message {

    @Id
    private Long id;

    private LocalDateTime dateTime;

    private String text;

    private String sender;

    private String addressee;

    @JoinColumn(name = "pic_id")
    @Embedded
    private Picture pic;

    public Message(LocalDateTime dateTime, String text, String sender, String addressee, Picture pic) {
        this.dateTime = dateTime;
        this.text = text;
        this.sender = sender;
        this.addressee = addressee;
        this.pic = pic;
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
