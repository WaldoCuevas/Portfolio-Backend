package com.portfolio.portfolioBackend.Persona.Service;

import java.util.List;

import com.portfolio.portfolioBackend.Persona.Models.Education;

public interface EducationService {

    /* GetData */
    public Education getDataEducational(Integer id);

    public List<Education> getAllDataEducational();

    /* AddData */

    public Education addDataEducational(Education education);

    /* ModifyData */

    public Education modifyDataEducational(Integer id, Education education);

    /* DeleteData */

    public void deleteDataEducational(Integer id);

}
