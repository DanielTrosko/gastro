package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
public class Order extends BaseEntity{
    @NotNull
    private Waitress waitress;
    @NotNull
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private Table table;
    private List<Product> productList;
}
