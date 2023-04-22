package com.portfolio.portfolioBackend.Persona.Repository;

//  Anotacion para hacer esta interfaz un Repositorio
import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.Persona.Models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    
}
