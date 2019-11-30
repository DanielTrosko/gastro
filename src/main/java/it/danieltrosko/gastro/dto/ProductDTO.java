package it.danieltrosko.gastro.dto;

import it.danieltrosko.gastro.model.entities.Category;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private BigDecimal price;
    @NotNull
    private Integer size;
    @NotBlank
    private String description;
    @NotNull
    private Category category;
    @NotNull
    private byte[] photo;
}
