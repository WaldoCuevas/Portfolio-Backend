package com.portfolio.portfolioBackend.Persona.Service;

import java.util.List;

import com.portfolio.portfolioBackend.Persona.Models.Project;

public interface ProjectService {

    /* GetData */

    public List<Project> getDataProject();

    /* AddData */

    public Project addDataProject(Project project);

    /* ModifyData */

    public Project modifyDataProject(Integer id, Project project);

    /* DeleteData */

    public void deleteDataProject(Integer id);

}
