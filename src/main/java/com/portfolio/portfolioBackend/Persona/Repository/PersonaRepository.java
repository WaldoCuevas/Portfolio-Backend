package com.portfolio.portfolioBackend.Persona.Repository;

//  Anotacion para hacer esta interfaz un Repositorio
import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.Persona.Models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    
}
