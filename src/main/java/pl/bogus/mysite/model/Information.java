package pl.bogus.mysite.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
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

    @Lob
    private String content;
    private Date created;


}
