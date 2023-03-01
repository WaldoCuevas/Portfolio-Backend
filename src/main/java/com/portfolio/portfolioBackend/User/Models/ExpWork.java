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
@Table(name = "experiencia_laboral")
public class ExpWork {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_laboral_id")
    private Integer exp_laboral_id;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "inicio")
    private String inicio;

    @Column(name = "fin")
    private String fin;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "expWork")
    @JsonIgnore
    private List<User> exp_work = new ArrayList<>();

}
