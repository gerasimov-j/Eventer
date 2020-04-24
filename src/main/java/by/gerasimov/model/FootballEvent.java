package by.gerasimov.model;

import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class FootballEvent extends Event {

    private String site;

    @Override
    public String toString() {
        return "FootballEvent: " + getName() + " site:" + getSite();
    }
}
