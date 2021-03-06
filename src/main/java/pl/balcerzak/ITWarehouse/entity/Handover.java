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
@Table(name = "handovers")
public class Handover {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHandover;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;
    private Date handoverDate;
}
