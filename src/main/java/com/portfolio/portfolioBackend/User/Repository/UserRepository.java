package com.portfolio.portfolioBackend.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.User.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
