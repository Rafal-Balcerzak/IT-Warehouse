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
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmployee;
    private String name;
    private String lastName;
    private String department;
    private String position;
    private String phoneNumber;
    private String email;
    @ManyToOne
    @JoinColumn(name = "id_company")
    private Company company;
}
