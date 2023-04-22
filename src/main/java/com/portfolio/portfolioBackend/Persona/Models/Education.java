package com.portfolio.portfolioBackend.Persona.Models;

// Ignorar Json Infinitos
import com.fasterxml.jackson.annotation.JsonIgnore;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private Integer education_id;

    @Column(name = "education_image")
    private String education_image;

    @Column(name = "school")
    private String school;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "description_education_r1")
    private String description_education_r1;

    @Column(name = "description_education_r2")
    private String description_education_r2;

    @Column(name = "description_education_r3")
    private String description_education_r3;

    @Column(name = "description_education_r4")
    private String description_education_r4;

    @Column(name = "start_education")
    private String start_education;

    @Column(name = "end_education")
    private String end_education;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=true)
    @JsonIgnore
    private Person education;

}
