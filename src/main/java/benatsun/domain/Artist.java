package benatsun.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Artist implements Serializable {

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;

    public Artist() {

    }
    public Artist(String name) {
        this.name = name;
    }
}
