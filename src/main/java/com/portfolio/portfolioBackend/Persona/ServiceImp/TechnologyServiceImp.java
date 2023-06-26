package com.portfolio.portfolioBackend.Persona.ServiceImp;

import java.util.List;
import java.util.Optional;

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

    public Technology getDataTechnology(Integer id) {

        Optional<Technology> technology = technologyRepository.findById(id);

        return technology.orElse(null);

    }



    @Override
    public List<Technology> getAllDataTechnology() {


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
        technologyDb.setBadge_technology_1(technology.getBadge_technology_1());
        technologyDb.setBadge_technology_2(technology.getBadge_technology_2());
        technologyDb.setBadge_technology_3(technology.getBadge_technology_3());
        technologyDb.setBadge_technology_4(technology.getBadge_technology_4());

        technologyRepository.save(technologyDb);

        return technologyDb;
    }

    /* DeleteData */

    @Override
    public void deleteDataTechnology(Integer id) {
        technologyRepository.deleteById(id);
    }

}
