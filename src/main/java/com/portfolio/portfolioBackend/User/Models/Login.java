package com.portfolio.portfolioBackend.User.Models;

// Correcion para el bucle infinito de Json
import com.fasterxml.jackson.annotation.JsonBackReference;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "iniciar_sesion")
public class Login {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login_id")
    private Integer login_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_password")
    private String user_password;

    @OneToOne(mappedBy = "login",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private User user;
    
}
