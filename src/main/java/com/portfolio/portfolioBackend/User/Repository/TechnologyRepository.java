package com.portfolio.portfolioBackend.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioBackend.User.Models.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
