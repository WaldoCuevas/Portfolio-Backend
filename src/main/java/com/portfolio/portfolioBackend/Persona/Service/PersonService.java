package com.portfolio.portfolioBackend.Persona.Service;

import com.portfolio.portfolioBackend.Persona.Models.Person;

public interface PersonService {

    /* GetData */

    public Person getPersonalData();

    /* AddData */

    public Person addPersonalData(Person person);

    /* ModifyData */

    public Person modifyPersonalData(Person person);

    /* DeleteData */

    public void deletePersonalData();

}
