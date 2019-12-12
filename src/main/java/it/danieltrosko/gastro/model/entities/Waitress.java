package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Waitress extends BaseEntity {
    @Column(unique = true)
    private String username;
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    private BigDecimal balance;
}
