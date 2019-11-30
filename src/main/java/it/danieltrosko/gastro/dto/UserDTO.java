package it.danieltrosko.gastro.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class UserDTO {



    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String firstName;
    @NotBlank
    private String secondName;
    @NotNull
    private BigDecimal balance;

}
