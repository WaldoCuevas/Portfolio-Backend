package com.portfolio.portfolioBackend.Persona.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Persona.Models.Technology;
import com.portfolio.portfolioBackend.Persona.Repository.TechnologyRepository;
import com.portfolio.portfolioBackend.Persona.Service.TechnologyService;

@Service
public class TechnologyServiceImp implements TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    /* ReadData */

    @Override
    public List<Technology> getDataTechnology() {
        return technologyRepository.findAll();
    }

    /* AddData */

    @Override
    public Technology addDataTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }
    /* ModifyData */

    @Override
    public Technology modifyDataTechnology(Integer id, Technology technology) {

        Technology technologyDb = technologyRepository.findById(id).get();

        technologyDb.setName_technology(technology.getName_technology());
        technologyDb.setDescription_technology_r1(technology.getDescription_technology_r1());
        technologyDb.setDescription_technology_r2(technology.getDescription_technology_r2());

        technologyRepository.save(technologyDb);

        return technologyDb;
    }

    /* DeleteData */

    @Override
    public void deleteDataTechnology(Integer id) {
        technologyRepository.deleteById(id);
    }

}
