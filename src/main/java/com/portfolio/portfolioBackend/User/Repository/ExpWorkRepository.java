package com.portfolio.portfolioBackend.User.Repository;

//  Anotacion para hacer esta interfaz un Repositorio
import org.springframework.data.jpa.repository.JpaRepository;

//  Entidad Relacionada
import com.portfolio.portfolioBackend.User.Models.ExpWork;

public interface ExpWorkRepository extends JpaRepository<ExpWork,Integer>{
    
}
