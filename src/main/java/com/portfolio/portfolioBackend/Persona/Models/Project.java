package com.portfolio.portfolioBackend.Persona.Models;


//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proyectos_id")
    private Integer project_id;

    @Column(name = "project_image")
    private String project_image;

    @Column(name = "project_title")
    private String project_title;

    @Column(name = "project_name")
    private String project_name;

    @Column(name = "project_description")
    private String project_description;

    @Column(name = "link_project")
    private String link_project;

    @Column(name = "link_github")
    private String link_github;

    @Column(name = "start_project")
    private String start_project;
    
    @Column(name = "end_project")
    private String end_project;

}
