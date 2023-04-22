package com.portfolio.portfolioBackend.Persona.ServiceImp;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Persona.Models.Person;
import com.portfolio.portfolioBackend.Persona.Repository.PersonRepository;
import com.portfolio.portfolioBackend.Persona.Service.PersonService;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonRepository personRepository;

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
    public Person getPersonalData() {

        Person datos = personRepository.findAll().get(0);

        datos.setTechnologys(this.technologyService.getDataTechnology());
        datos.setEducations(this.educationService.getDataEducational());
        datos.setWorkExps(this.expWorkService.getDataWork());
        datos.setSkills(this.skillService.getDataSkill());
        datos.setProjects(this.projectService.getDataProject());

        return datos;
    }

    /* AddData */

    @Override
    public Person addPersonalData(Person person) {

        return personRepository.save(person);
    }

    /* ModifyData */

    @Override
    public Person modifyPersonalData(Person person) {

        Person personDB = this.personRepository.findById(1).get();
        
        personDB.setName(person.getName());
        personDB.setLast_name(person.getLast_name());
        personDB.setEmail(person.getEmail());
        personDB.setUser_image(person.getUser_image());
        personDB.setAbout_me_r1(person.getAbout_me_r1());
        personDB.setAbout_me_r2(person.getAbout_me_r2());

        // login data
        personDB.setUser_name(person.getUser_name());
        personDB.setUser_password(person.getUser_password());

        personDB.setTechnologys(person.getTechnologys());
        personDB.setEducations(person.getEducations());
        personDB.setWorkExps(person.getWorkExps());
        personDB.setSkills(person.getSkills());
        personDB.setProjects(person.getProjects());

        personRepository.save(personDB);

        return personDB;
    }

    /* DeleteData */

    @Override
    public void deletePersonalData() {
        personRepository.deleteById(1);
    }

}
