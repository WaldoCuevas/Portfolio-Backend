package com.portfolio.portfolioBackend.User.Models;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "proyectos")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proyectos_id")
    private Integer proyectos_id;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "proyecto")
    private String proyecto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "inicio")
    private String inicio;

    @Column(name = "fin")
    private String fin;

}
