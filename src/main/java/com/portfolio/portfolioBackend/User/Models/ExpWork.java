package com.portfolio.portfolioBackend.User.Models;

// Ignorar Json Infinitos
//import com.fasterxml.jackson.annotation.JsonIgnore;

//Librerias necesarias ->
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Work_Experience")
public class ExpWork {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_exp_id")
    private Integer work_exp_id;

    @Column(name = "work_image")
    private String work_image;

    @Column(name = "workplace")
    private String workplace;

    @Column(name = "workstation")
    private String workstation;

    @Column(name = "job")
    private String job;

    @Column(name = "description_r1")
    private String description_r1;

    @Column(name = "description_r2")
    private String description_r2;

    @Column(name = "description_r3")
    private String description_r3;

    @Column(name = "start")
    private String start;
    
    @Column(name = "end")
    private String end;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=false)
    private User workExps;
}
