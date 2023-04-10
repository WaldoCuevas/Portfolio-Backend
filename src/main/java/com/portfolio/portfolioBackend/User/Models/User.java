package com.portfolio.portfolioBackend.User.Models;

// Ignorar Json Infinitos
//import com.fasterxml.jackson.annotation.JsonManagedReference;

//Librerias necesarias ->
import java.util.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_password")
    private String user_password;

    @Column(name = "about_me_r1")
    private String about_me_r1;

    @Column(name = "about_me_r2")
    private String about_me_r2;

    // Tabla Technology
    @OneToMany(mappedBy = "technology")
    private List<Technology> technologys;

    // Tabla Educacion
    @OneToMany(mappedBy = "education")
    private List<Education> educations;

    // Tabla experiencia Laboral
    @OneToMany(mappedBy = "workExp")
    private List<ExpWork> workExps;
    
    //Tabla de Habilidades
    @OneToMany(mappedBy = "skill")
    private List<Skill> skills;

    // Tabla Project
    @OneToMany(mappedBy = "project")
    private List<Project> projects;

}
