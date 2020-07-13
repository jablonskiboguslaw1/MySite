package pl.bogus.mysite.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Information {
    public Information(String title, String content, Date created) {
        this.title = title;
        this.content = content;
        this.created = created;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private Date created;


}
