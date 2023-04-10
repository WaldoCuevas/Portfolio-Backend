package com.portfolio.portfolioBackend.User.Models;

// Ignorar Json Infinitos
import com.fasterxml.jackson.annotation.JsonIgnore;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "badge_technology_1")
    private String badge_technology_1;

    @Column(name = "badge_technology_2")
    private String badge_technology_2;

    @Column(name = "badge_technology_3")
    private String badge_technology_3;

    @Column(name = "badge_technology_4")
    private String badge_technology_4;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=true)
    @JsonIgnore
    private User technology;
}
