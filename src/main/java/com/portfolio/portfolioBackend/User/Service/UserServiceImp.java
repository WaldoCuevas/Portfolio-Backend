package com.portfolio.portfolioBackend.User.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.User.Models.Education;
import com.portfolio.portfolioBackend.User.Models.ExpWork;
import com.portfolio.portfolioBackend.User.Models.User;
import com.portfolio.portfolioBackend.User.Repository.EducationRepository;
import com.portfolio.portfolioBackend.User.Repository.ExpWorkRepository;
import com.portfolio.portfolioBackend.User.Repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExpWorkRepository expWorkRepository;

    @Autowired
    private EducationRepository educationRepository;

    /*  ReadData */

    @Override
    public List<User> getPersonalData() {

        User datos = userRepository.findById(1).get();

        List<User> datosPersonales = new ArrayList<>();

        datos.setExpWork(getDataWork());
        datos.setEducation(getDataEducational());

        datosPersonales.add(datos);

        return datosPersonales;
    }

    @Override
    public List<ExpWork> getDataWork() {
        return expWorkRepository.findAll();

    }

    @Override
    public List<Education> getDataEducational() {
        return educationRepository.findAll();
    }

    /*  AddPData */

    @Override
    public User addPersonalData(User user) {

        user.setExpWork(getDataWork());
        user.setEducation(getDataEducational());

        return userRepository.save(user);
    }

    @Override
    public ExpWork addDataWork(ExpWork expWork) {
        return expWorkRepository.save(expWork);

    }

    @Override
    public Education addDataEducational(Education education) {
        return educationRepository.save(education);
    }

    /*  ModifyData */

    @Override
    public User modifyPersonalData(Integer id, User user) {
        
        User userDb = this.userRepository.findById(id).get();

        // Campos seterados con los datos del Json
        userDb.setNombre(user.getNombre());
        userDb.setApellido(user.getApellido());
        userDb.setEmail(user.getEmail());
        userDb.setSobre_mi(user.getSobre_mi());

        // Campos User_name y User_password jamas deben ser seteados.
        
        //userDb.setUser_name(user.getUser_name());
        //userDb.setUser_password(user.getUser_password());

        // Objetos Seteados con los datos del Json
        userDb.setEducation(user.getEducation());
        userDb.setExpWork(user.getExpWork());

        // Lo guardammos en la base de Datos los datos recien seteados
        userRepository.save(userDb);

        // y lo retornamos con el metodo para poder visualizarlo en el Json.
        return userDb;
    }

    @Override
    public ExpWork modifyDataWork(Integer id, ExpWork expWork) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyDataWork'");
    }

    @Override
    public Education modifyDataEducational(Integer id, Education education) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyDataEducational'");
    }

    /*  DeleteData */

    @Override
    public void deletePersonalData(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePersonalData'");
    }

    @Override
    public void deleteAataWork(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAataWork'");
    }

    @Override
    public void deleteDataEducational(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDataEducational'");
    }

}
