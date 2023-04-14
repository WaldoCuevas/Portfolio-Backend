package com.portfolio.portfolioBackend.Persona.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Persona.Models.Project;
import com.portfolio.portfolioBackend.Persona.Repository.ProjectRepository;
import com.portfolio.portfolioBackend.Persona.Service.ProjectService;

@Service
public class ProjectServiceImp implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    /* ReadData */

    @Override
    public List<Project> getDataProject() {
        return projectRepository.findAll();
    }

    /* AddData */

    @Override
    public Project addDataProject(Project project) {
        return projectRepository.save(project);
    }

    /* ModifyData */

    @Override
    public Project modifyDataProject(Integer id, Project project) {

        Project projectDb = projectRepository.findById(id).get();

        projectDb.setProject_image(project.getProject_image());
        projectDb.setProject_title(project.getProject_title());
        projectDb.setProject_name(project.getProject_name());
        projectDb.setProject_description(project.getProject_description());
        projectDb.setLink_project(project.getLink_project());
        projectDb.setLink_github(project.getLink_github());
        projectDb.setStart_project(project.getStart_project());
        projectDb.setEnd_project(project.getEnd_project());

        projectRepository.save(projectDb);

        return projectDb;
    }

    /* DeleteData */

    @Override
    public void deleteDataProject(Integer id) {
        projectRepository.deleteById(id);
    }

}
