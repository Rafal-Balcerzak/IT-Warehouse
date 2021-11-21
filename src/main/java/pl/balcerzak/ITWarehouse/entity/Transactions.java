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
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTransaction;
    @ManyToOne
    @JoinColumn(name = "id_demand")
    private Demand demand;
    @ManyToOne
    @JoinColumn(name = "id_distributor")
    private Distributors distributors;
    private Date transactionDate;
    private String price;

}
