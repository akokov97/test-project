package springbootapp.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table

public class ListOfAds {

    @Getter
    @Setter
    private Long id;
    private String name;
    private Long number;
    private LocalDateTime date;
    private String linkToAd;

    public ListOfAds(Long id, String name, Long number, LocalDateTime date, String linkToAd) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.date = date;
        this.linkToAd = linkToAd;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    //
}
