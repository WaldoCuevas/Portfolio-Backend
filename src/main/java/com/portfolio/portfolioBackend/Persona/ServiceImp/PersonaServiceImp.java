package com.portfolio.portfolioBackend.Persona.ServiceImp;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Persona.Models.Persona;
import com.portfolio.portfolioBackend.Persona.Repository.PersonaRepository;
import com.portfolio.portfolioBackend.Persona.Service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private EducationServiceImp educationService;

    @Autowired
    private ExpWorkServiceImp expWorkService;

    @Autowired
    private ProjectServiceImp projectService;

    @Autowired
    private SkillServiceImp skillService;

    @Autowired
    private TechnologyServiceImp technologyService;

    /* ReadData */

    @Override
    public Persona getPersonalData() {

        Persona datos = personaRepository.findAll().get(0);

        datos.setTechnologys(this.technologyService.getDataTechnology());
        datos.setEducations(this.educationService.getDataEducational());
        datos.setWorkExps(this.expWorkService.getDataWork());
        datos.setSkills(this.skillService.getDataSkill());
        datos.setProjects(this.projectService.getDataProject());

        return datos;
    }

    /* AddData */

    @Override
    public Persona addPersonalData(Persona persona) {

        return personaRepository.save(persona);
    }

    /* ModifyData */

    @Override
    public Persona modifyPersonalData(Persona persona) {

        Persona personaDB = this.personaRepository.findById(0).get();

        personaDB.setLast_name(persona.getLast_name());
        personaDB.setEmail(persona.getEmail());
        personaDB.setAbout_me_r1(persona.getAbout_me_r1());
        personaDB.setAbout_me_r2(persona.getAbout_me_r2());

        // login data
        personaDB.setUser_name(persona.getUser_name());
        personaDB.setUser_password(persona.getUser_password());

        personaDB.setTechnologys(persona.getTechnologys());
        personaDB.setEducations(persona.getEducations());
        personaDB.setWorkExps(persona.getWorkExps());
        personaDB.setSkills(persona.getSkills());
        personaDB.setProjects(persona.getProjects());

        personaRepository.save(personaDB);

        return personaDB;
    }

    /* DeleteData */

    @Override
    public void deletePersonalData() {
        personaRepository.deleteById(0);
    }

}
