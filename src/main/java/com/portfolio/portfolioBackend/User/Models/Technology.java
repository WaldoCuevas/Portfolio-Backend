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
@Table(name = "tecnologias")
public class Technology {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tecnology_id")
    private Integer tecnology_id;

    @Column(name = "name_technology")
    private String name_technology;

    @Column(name = "description_technology_r1")
    private String description_technology_r1;
    
    @Column(name = "description_technology_r2")
    private String description_technology_r2;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "technologys")
    @JsonIgnore
    private List<User> technologys = new ArrayList<>();
    
}
