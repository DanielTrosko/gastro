package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {
    @NotBlank
    private String name;
    @NotNull
    private BigDecimal price;
    @NotNull
    private Integer size;
    @NotBlank
    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] photo;
}
