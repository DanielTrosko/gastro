package it.danieltrosko.gastro.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class WaitressDTO {



    private Long id;
    @NotNull
    private LocalDateTime createdOn;
    @NotNull
    private LocalDateTime updateOn;
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
