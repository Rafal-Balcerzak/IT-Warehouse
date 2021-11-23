package pl.balcerzak.ITWarehouse.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@NoArgsConstructor
@Table(name = "demands")
public class Demand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDemand;
    private String productType;
    private String model;
    private Date issueDate;
    private String budget;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "id_company")
    private Company company;
}
