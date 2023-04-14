package com.portfolio.portfolioBackend.Persona.Service;

import com.portfolio.portfolioBackend.Persona.Models.Persona;

public interface PersonaService {

    /* GetData */

    public Persona getPersonalData();

    /* AddData */

    public Persona addPersonalData(Persona user);

    /* ModifyData */

    public Persona modifyPersonalData(Persona user);

    /* DeleteData */

    public void deletePersonalData();

}
