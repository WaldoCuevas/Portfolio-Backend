package com.portfolio.portfolioBackend.User.Models;

// Ignorar Json Infinitos
import com.fasterxml.jackson.annotation.JsonIgnore;

//Librerias necesarias ->
import java.util.*;
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

    @Column(name = "description_r1")
    private String description_r1;

    @Column(name = "description_r2")
    private String description_r2;

    @Column(name = "description_r3")
    private String description_r3;

    @Column(name = "description_r4")
    private String description_r4;

    @Column(name = "start")
    private String start;

    @Column(name = "end")
    private String end;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "educations")
    @JsonIgnore
    private List<User> educations = new ArrayList<>();

}
