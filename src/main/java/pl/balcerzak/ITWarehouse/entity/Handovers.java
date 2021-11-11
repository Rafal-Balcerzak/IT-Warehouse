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
public class Handovers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHandover;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Products products;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employees employees;
    private Date handoverDate;
}
