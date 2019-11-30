package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {
    private String name;
    private BigDecimal price;
    private Integer size;
    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] photo;
}
