package com.portfolio.portfolioBackend.Persona.Repository;

//  Anotacion para hacer esta interfaz un Repositorio
import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.Persona.Models.ExpWork;

public interface ExpWorkRepository extends JpaRepository<ExpWork,Integer>{
    
}
