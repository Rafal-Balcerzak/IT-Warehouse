package pl.balcerzak.ITWarehouse.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@NoArgsConstructor
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAddress;
    private String country;
    private String region;
    private String city;
    private String street;
    private String localNumber;
    private String zipCode;
}
