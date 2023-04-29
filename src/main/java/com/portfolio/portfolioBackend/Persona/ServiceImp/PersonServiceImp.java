package com.portfolio.portfolioBackend.Persona.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Persona.Models.Person;
import com.portfolio.portfolioBackend.Persona.Repository.PersonRepository;
import com.portfolio.portfolioBackend.Persona.Service.PersonService;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    /* ReadData */

    @Override
    public Person getPersonalData() {
        return personRepository.findById(1).get();
    }

    /* AddData */

    @Override
    public Person addPersonalData(Person person) {

        return personRepository.save(person);
    }

    /* ModifyData */

    @Override
    public Person modifyPersonalData(Person person, Integer id) {

        Person personDB = this.personRepository.findById(id).get();

        personDB.setName(person.getName());
        personDB.setLast_name(person.getLast_name());
        personDB.setUser_image(person.getUser_image());
        personDB.setAbout_me_r1(person.getAbout_me_r1());
        personDB.setAbout_me_r2(person.getAbout_me_r2());

        personRepository.save(personDB);

        return personDB;
    }

    /* DeleteData */

    @Override
    public void deletePersonalData(Integer id) {
        personRepository.deleteById(id);
    }

}
