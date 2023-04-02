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
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "User_Technology", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_Technology"))
    private List<Technology> technologys = new ArrayList<>();

    // Tabla Educacion
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "User_Education", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_education"))
    private List<Education> educations = new ArrayList<>();

    // Tabla experiencia Laboral
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "User_ExpWork", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_skill"))
    private List<ExpWork> workExps = new ArrayList<>();
    
    //Tabla de Habilidades
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "User_Skills", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_work_exp"))
    private List<Skill> skills = new ArrayList<>();

    // Tabla Project
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "User_Project", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_project"))
    private List<Project> projects = new ArrayList<>();

    

}
