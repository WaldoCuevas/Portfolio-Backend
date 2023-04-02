package com.portfolio.portfolioBackend.User.Service;

import java.util.List;

import com.portfolio.portfolioBackend.User.Models.ExpWork;

public interface ExpWorkService {

    /* GetData */

    public List<ExpWork> getDataWork();

    /* AddData */

    public ExpWork addDataWork(ExpWork expWork);

    /* ModifyData */

    public ExpWork modifyDataWork(Integer id, ExpWork expWork);

    /* DeleteData */

    public void deleteDataWork(Integer id);

}
