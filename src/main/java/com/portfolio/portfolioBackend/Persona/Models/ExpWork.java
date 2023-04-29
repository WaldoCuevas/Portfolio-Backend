package com.portfolio.portfolioBackend.Persona.Models;

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

    @Column(name = "description_work_exp_r1")
    private String description_work_exp_r1;

    @Column(name = "description_work_exp_r2")
    private String description_work_exp_r2;

    @Column(name = "description_work_exp_r3")
    private String description_work_exp_r3;

    @Column(name = "start_work_exp")
    private String start_work_exp;
    
    @Column(name = "end_work_exp")
    private String end_work_exp;

}
