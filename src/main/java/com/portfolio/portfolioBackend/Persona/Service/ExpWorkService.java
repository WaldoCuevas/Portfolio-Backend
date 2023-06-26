package com.portfolio.portfolioBackend.Persona.Service;

import java.util.List;

import com.portfolio.portfolioBackend.Persona.Models.ExpWork;

public interface ExpWorkService {

    /* GetData */
    public ExpWork getDataWork(Integer id);

    public List<ExpWork> getAllDataWork();

    /* AddData */

    public ExpWork addDataWork(ExpWork expWork);

    /* ModifyData */

    public ExpWork modifyDataWork(Integer id, ExpWork expWork);

    /* DeleteData */

    public void deleteDataWork(Integer id);

}
