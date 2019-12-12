package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@javax.persistence.Table(name = "order_table")
@Getter @Setter
public class Order extends BaseEntity {
    @ManyToOne(cascade = CascadeType.ALL)
    private Waitress waitress;
    @NotNull
    private BigDecimal balance;
    @OneToMany( cascade = CascadeType.ALL)
    private List<Product> productList;

}
