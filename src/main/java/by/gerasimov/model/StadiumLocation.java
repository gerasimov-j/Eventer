package by.gerasimov.model;

import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class StadiumLocation extends Location {

    private int capacity;
    private String site;
}
