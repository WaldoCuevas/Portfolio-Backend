package com.portfolio.portfolioBackend.Security.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Security.Enums.RolNombre;
import com.portfolio.portfolioBackend.Security.Models.Rol;
import com.portfolio.portfolioBackend.Security.Repository.RolRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        rolRepository.save(rol);
    }
}
