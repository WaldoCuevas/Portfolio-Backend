package com.portfolio.portfolioBackend.User.Models;

// Ignorar Json Infinitos
//import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Column(name = "start")
    private String start;
    
    @Column(name = "end")
    private String end;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=false)
    private User projects;
}
