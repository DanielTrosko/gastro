package it.danieltrosko.gastro.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter @Setter
public class TableDTO {
    private Long id;
    @NotNull
    private LocalDateTime createdOn;
    @NotNull
    private LocalDateTime updateOn;
    @NotBlank
    private String name;
}
