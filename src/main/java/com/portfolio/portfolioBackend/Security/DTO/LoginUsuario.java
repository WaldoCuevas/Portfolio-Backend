package com.portfolio.portfolioBackend.Security.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUsuario {

    @NotBlank
    private String nombreUsuario;

    @NotBlank
    private String password;
    
}
