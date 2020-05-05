package by.gerasimov.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double latitude;
    private double longitude;
    @OneToOne(fetch = FetchType.EAGER)
    private Address address;
    private String name;

    public Location() {
    }

//    public Locality getLocality() {
//        return address.getLocality();
//    }
//
//    public Country getCountry() {
//        return address.getLocality().getCountry();
//    }

    @Override
    public String toString() {
        return name;
    }
}
