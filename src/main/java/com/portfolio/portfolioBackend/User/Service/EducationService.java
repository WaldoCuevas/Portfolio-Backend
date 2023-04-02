package com.portfolio.portfolioBackend.User.Service;

import java.util.List;

import com.portfolio.portfolioBackend.User.Models.Education;

public interface EducationService {

    /* GetData */

    public List<Education> getDataEducational();

    /* AddData */

    public Education addDataEducational(Education education);

    /* ModifyData */

    public Education modifyDataEducational(Integer id, Education education);

    /* DeleteData */

    public void deleteDataEducational(Integer id);

}
