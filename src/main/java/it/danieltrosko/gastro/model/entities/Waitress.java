package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Waitress extends BaseUser {
    private BigDecimal balance;
}
