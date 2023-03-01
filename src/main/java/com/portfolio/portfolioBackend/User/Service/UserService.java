package com.portfolio.portfolioBackend.User.Service;

import java.util.List;

import com.portfolio.portfolioBackend.User.Models.Education;
import com.portfolio.portfolioBackend.User.Models.ExpWork;
import com.portfolio.portfolioBackend.User.Models.User;

public interface UserService {
    
    /*  GetData */

    // Obtener datos personales
    public List<User> getPersonalData();

    // Obtener datos laborales
    public List<ExpWork> getDataWork();

    // Obtener datos Educativos
    public List<Education> getDataEducational();

    /*  AddData */

    // Añadir datos personales
    public User addPersonalData(User user);

    // Añadir datos laborales
    public ExpWork addDataWork(ExpWork expWork);

    // Añadir datos Educativos
    public Education addDataEducational(Education education);
    
    /*  ModifyData */

    // Modificar datos personales
    public User modifyPersonalData(Integer id, User user);

    // Modificar datos laborales
    public ExpWork modifyDataWork(Integer id, ExpWork expWork);

    // Modificar datos Educativos
    public Education modifyDataEducational(Integer id, Education education);


    /*  DeleteData */

    // Eliminar datos personales
    public void deletePersonalData(Integer id);

    // Eliminar datos laborales
    public void deleteAataWork(Integer id);

    // Eliminar datos Educativos
    public void deleteDataEducational(Integer id);

}
