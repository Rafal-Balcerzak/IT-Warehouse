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
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTransaction;
    @ManyToOne
    @JoinColumn(name = "id_demand")
    private Demand demand;
    @ManyToOne
    @JoinColumn(name = "id_distributor")
    private Distributor distributor;
    private Date transactionDate;
    private String price;
    private String description;
    @Lob
    private byte[] attachment;
    private String attachmentContentType;

}
