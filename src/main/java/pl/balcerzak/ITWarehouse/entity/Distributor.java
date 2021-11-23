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
@Table(name = "distributors")
public class Distributor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDistributor;
    @ManyToOne
    @JoinColumn(name = "id_company")
    private Company company;
    private String phoneNumber;
    private String email;
}
