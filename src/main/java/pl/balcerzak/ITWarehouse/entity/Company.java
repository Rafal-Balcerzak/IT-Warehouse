package pl.balcerzak.ITWarehouse.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@NoArgsConstructor
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCompany;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_address")
    private Address address;
    private String nip;

}
