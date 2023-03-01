package com.portfolio.portfolioBackend.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.User.Models.Education;

public interface EducationRepository extends JpaRepository<Education,Integer>{
    
}
