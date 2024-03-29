package com.portfolio.portfolioBackend.Persona.Service;

import java.util.List;

import com.portfolio.portfolioBackend.Persona.Models.Skill;

public interface SkillService {

    /* GetData */
    public Skill getDataSkill(Integer id);

    public List<Skill> getAllDataSkill();

    /* AddData */

    public Skill addDataSkill(Skill skill);

    /* ModifyData */

    public Skill modifyDataSkill(Integer id, Skill skill);

    /* DeleteData */

    public void deleteDataSkill(Integer id);

}
