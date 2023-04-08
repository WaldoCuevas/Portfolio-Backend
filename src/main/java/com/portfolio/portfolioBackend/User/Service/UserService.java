package com.portfolio.portfolioBackend.User.Service;

import com.portfolio.portfolioBackend.User.Models.User;

public interface UserService {

    /* GetData */

    public User getPersonalData();

    /* AddData */

    public User addPersonalData(User user);

    /* ModifyData */

    public User modifyPersonalData(User user);

    /* DeleteData */

    public void deletePersonalData();

}
