package com.portfolio.portfolioBackend.Persona.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Ignorar Json Infinitos
//import com.fasterxml.jackson.annotation.JsonIgnore;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Integer skill_id;

    @Column(name = "skill_image")
    private String skill_image;

    @Column(name = "skills_name")
    private String skills_name;

    @Column(name = "skill_porcent")
    private Float skill_porcent;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=true)
    @JsonIgnore
    private Persona skill;
}
