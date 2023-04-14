package com.portfolio.portfolioBackend.Security.Models;

import com.portfolio.portfolioBackend.Security.Enums.RolNombre;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Rol {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Aqui es importante decirle a Spring. que RolNombre es un Enums de tipo de
     * Cadena. (revisar Enums.RolNombre.java)
     * por eso usamos la siguiente anotacion.
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol(@NotNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }


}
