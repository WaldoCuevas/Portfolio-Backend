/*package com.portfolio.portfolioBackend.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.portfolio.portfolioBackend.Security.Enums.RolNombre;
import com.portfolio.portfolioBackend.Security.Models.Rol;
import com.portfolio.portfolioBackend.Security.Service.RolService;

@Component
public class CreateRoles implements CommandLineRunner{

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
    }
    
}
*/