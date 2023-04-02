package com.portfolio.portfolioBackend.User.Service;

import java.util.List;

import com.portfolio.portfolioBackend.User.Models.User;

public interface UserService {

    /* GetData */

    public List<User> getPersonalData(Integer id);

    /* AddData */

    public User addPersonalData(User user);

    /* ModifyData */

    public User modifyPersonalData(Integer id, User user);

    /* DeleteData */

    public void deletePersonalData(Integer id);

}
