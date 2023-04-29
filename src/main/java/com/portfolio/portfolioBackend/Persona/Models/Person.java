package com.portfolio.portfolioBackend.Persona.Models;

// Ignorar Json Infinitos
//import com.fasterxml.jackson.annotation.JsonManagedReference;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "user_image")
    private String user_image;

    @Column(name = "about_me_r1")
    private String about_me_r1;

    @Column(name = "about_me_r2")
    private String about_me_r2;

}
