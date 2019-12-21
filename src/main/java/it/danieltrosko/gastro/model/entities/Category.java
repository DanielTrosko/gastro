package it.danieltrosko.gastro.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter @Setter
public class Category extends BaseEntity {
    @NotNull
    private String name;
    @NotBlank
    private Integer numberOfCategory;
}
