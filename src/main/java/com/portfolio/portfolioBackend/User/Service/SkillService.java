package com.portfolio.portfolioBackend.User.Service;

import java.util.List;

import com.portfolio.portfolioBackend.User.Models.Skill;

public interface SkillService {

    /* GetData */

    public List<Skill> getDataSkill();

    /* AddData */

    public Skill addDataSkill(Skill skill);

    /* ModifyData */

    public Skill modifyDataSkill(Integer id, Skill skill);

    /* DeleteData */

    public void deleteDataSkill(Integer id);

}
