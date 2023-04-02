package com.portfolio.portfolioBackend.User.Models;

// Ignorar Json Infinitos
import com.fasterxml.jackson.annotation.JsonIgnore;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "skills")
    @JsonIgnore
    private List<User> skills = new ArrayList<>();

}
