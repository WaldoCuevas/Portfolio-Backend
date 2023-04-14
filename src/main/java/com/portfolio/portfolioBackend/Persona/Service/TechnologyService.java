package com.portfolio.portfolioBackend.Persona.Service;

import java.util.List;

import com.portfolio.portfolioBackend.Persona.Models.Technology;

public interface TechnologyService {

    /* GetData */

    public List<Technology> getDataTechnology();

    /* AddData */

    public Technology addDataTechnology(Technology technology);

    /* ModifyData */

    public Technology modifyDataTechnology(Integer id, Technology technology);

    /* DeleteData */

    public void deleteDataTechnology(Integer id);

}
