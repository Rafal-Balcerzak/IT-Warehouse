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
public class Distributors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDistributor;
    @ManyToOne
    @JoinColumn(name = "id_companie")
    private Companies companies;
    private String phoneNumber;
    private String email;
}
