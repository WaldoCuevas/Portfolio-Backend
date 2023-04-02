package com.portfolio.portfolioBackend.User.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.User.Models.Technology;
import com.portfolio.portfolioBackend.User.Repository.TechnologyRepository;
import com.portfolio.portfolioBackend.User.Service.TechnologyService;

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
