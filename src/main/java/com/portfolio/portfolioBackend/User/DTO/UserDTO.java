package com.portfolio.portfolioBackend.User.DTO;

import java.util.ArrayList;
import java.util.List;

import com.portfolio.portfolioBackend.User.Models.Education;
import com.portfolio.portfolioBackend.User.Models.ExpWork;
import com.portfolio.portfolioBackend.User.Models.Project;
import com.portfolio.portfolioBackend.User.Models.Technology;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Integer usuario_id;

    private String nombre;

    private String apellido;

    private String email;

    private String sobre_mi;

    private String user_name;

    private String user_password;

    private List<ExpWork> expWork = new ArrayList<>();

    private List<Education> education = new ArrayList<>();
    
    private List<Project> project = new ArrayList<>();

    private List<Technology> technology = new ArrayList<>();
}
