package com.portfolio.portfolioBackend.Security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.Security.Enums.RolNombre;
import com.portfolio.portfolioBackend.Security.Models.Rol;

public interface RolRepository extends JpaRepository<Rol,Integer>{
 
    Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
 