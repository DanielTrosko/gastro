package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Getter @Setter
public class Product extends BaseEntity {
    @NotBlank
    private String name;
    @NotNull
    private BigDecimal price;
    @NotNull
    private Integer size;
    @NotBlank
    private String description;
    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] photo;
}
