package com.portfolio.portfolioBackend.User.DTO;

import java.util.ArrayList;
import java.util.List;

import com.portfolio.portfolioBackend.User.Models.Education;
import com.portfolio.portfolioBackend.User.Models.ExpWork;
import com.portfolio.portfolioBackend.User.Models.Project;
import com.portfolio.portfolioBackend.User.Models.Skill;
import com.portfolio.portfolioBackend.User.Models.Technology;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String nombre;

    private String apellido;

    private String email;

    private String sobre_mi;

    private String user_name;

    private String user_password;

    private List<Technology> technologys = new ArrayList<>();

    private List<Education> education = new ArrayList<>();

    private List<ExpWork> expWork = new ArrayList<>();
    
    private List<Skill> skills = new ArrayList<>();

    private List<Project> project = new ArrayList<>();

    
}
