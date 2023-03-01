package com.portfolio.portfolioBackend.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.User.Models.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
    
}
