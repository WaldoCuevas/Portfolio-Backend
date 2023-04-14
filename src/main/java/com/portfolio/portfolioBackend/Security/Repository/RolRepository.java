package com.portfolio.portfolioBackend.Security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfolioBackend.Security.Enums.RolNombre;
import com.portfolio.portfolioBackend.Security.Models.Rol;

@Repository
public interface RolRepository  extends JpaRepository<Rol,Integer>{
 
    Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
 