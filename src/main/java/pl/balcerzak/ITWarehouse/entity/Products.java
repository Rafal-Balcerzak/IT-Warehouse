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
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;
    private String product_type;
    private String producer;
    private String model;
    private String inventoryNumber;
    private String price;
    private Date productionDate;
    private Date warrantyEndDate;
    private String warrantyType;
    private boolean inStock;
    @ManyToOne
    @JoinColumn(name = "id_transaction")
    private Transactions transactions;

}
