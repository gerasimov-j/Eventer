package by.gerasimov.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private Date datetime;
    @ManyToOne(fetch = FetchType.EAGER)
    private Location location;

    public Event() {

    }

    public Event(Event event) {
        name = event.getName();
        description = event.getDescription();
        datetime = event.getDatetime();
        location = event.getLocation();
    }
}
