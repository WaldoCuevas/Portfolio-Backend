package com.portfolio.portfolioBackend.User.Models;

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

    @Column(name = "nombre_tecnologia")
    private String nombre_tecnologia;

    @Column(name = "descripcion_tecnologia")
    private String descripcion_tecnologia;

}
