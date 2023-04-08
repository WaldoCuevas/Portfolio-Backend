package com.portfolio.portfolioBackend.User.ServiceImp;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.portfolio.portfolioBackend.User.DTO.UserDTO;
import com.portfolio.portfolioBackend.User.Models.User;
import com.portfolio.portfolioBackend.User.Repository.UserRepository;
import com.portfolio.portfolioBackend.User.Service.UserService;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

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
    public User getPersonalData() {

        User datos = userRepository.findAll().get(0);

        datos.setTechnologys(this.technologyService.getDataTechnology());
        datos.setEducations(this.educationService.getDataEducational());
        datos.setWorkExps(this.expWorkService.getDataWork());
        datos.setSkills(this.skillService.getDataSkill());
        datos.setProjects(this.projectService.getDataProject());

        return datos;
    }

    /* AddData */

    @Override
    public User addPersonalData(User user) {

        user.setTechnologys(user.getTechnologys());
        user.setEducations(user.getEducations());
        user.setWorkExps(user.getWorkExps());
        user.setSkills(user.getSkills());
        user.setProjects(user.getProjects());

        return userRepository.save(user);
    }

    /* ModifyData */

    @Override
    public User modifyPersonalData(User user) {

        User userDb = this.userRepository.findById(0).get();

        userDb.setName(user.getName());
        userDb.setLast_name(user.getLast_name());
        userDb.setEmail(user.getEmail());
        userDb.setAbout_me_r1(user.getAbout_me_r1());
        userDb.setAbout_me_r2(user.getAbout_me_r2());

        // Campos User_name y User_password jamas deben ser seteados.

        // userDb.setUser_name(user.getUser_name());
        // userDb.setUser_password(user.getUser_password());

        userDb.setTechnologys(user.getTechnologys());
        userDb.setEducations(user.getEducations());
        userDb.setWorkExps(user.getWorkExps());
        userDb.setSkills(user.getSkills());
        userDb.setProjects(user.getProjects());

        userRepository.save(userDb);

        return userDb;
    }

    /* DeleteData */

    @Override
    public void deletePersonalData() {
        userRepository.deleteById(0);
    }

}
