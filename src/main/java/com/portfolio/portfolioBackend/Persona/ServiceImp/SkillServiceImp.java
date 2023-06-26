package com.portfolio.portfolioBackend.Persona.ServiceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Persona.Models.Skill;
import com.portfolio.portfolioBackend.Persona.Repository.SkillRepository;
import com.portfolio.portfolioBackend.Persona.Service.SkillService;

@Service
public class SkillServiceImp implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    /* ReadData */
    @Override
    public Skill getDataSkill(Integer id) {

        Optional<Skill> skill = skillRepository.findById(id);

        return skill.orElse(null);
    }

    @Override
    public List<Skill> getAllDataSkill() {
        return skillRepository.findAll();
    }

    /* AddData */

    @Override
    public Skill addDataSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    /* ModifyData */

    @Override
    public Skill modifyDataSkill(Integer id, Skill skill) {

        Skill skillDB = skillRepository.findById(id).get();

        skillDB.setSkill_image(skill.getSkill_image());
        skillDB.setSkills_name(skill.getSkills_name());
        skillDB.setSkill_porcent(skill.getSkill_porcent());

        skillRepository.save(skillDB);

        return skillDB;

    }

    /* DeleteData */

    @Override
    public void deleteDataSkill(Integer id) {
        skillRepository.deleteById(id);
    }

}
