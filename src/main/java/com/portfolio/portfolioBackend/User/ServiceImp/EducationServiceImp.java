package com.portfolio.portfolioBackend.User.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.User.Models.Education;
import com.portfolio.portfolioBackend.User.Repository.EducationRepository;
import com.portfolio.portfolioBackend.User.Service.EducationService;

@Service
public class EducationServiceImp implements EducationService {

    @Autowired
    private EducationRepository educationRepository;

    /* ReadData */

    @Override
    public List<Education> getDataEducational() {
        return educationRepository.findAll();
    }

    /* AddData */

    @Override
    public Education addDataEducational(Education education) {
        return educationRepository.save(education);
    }

    /* ModifyData */

    @Override
    public Education modifyDataEducational(Integer id, Education education) {

        Education educationDB = educationRepository.findById(id).get();

        educationDB.setEducation_image(education.getEducation_image());
        educationDB.setSchool(education.getSchool());
        educationDB.setQualification(education.getQualification());
        educationDB.setDescription_r1(education.getDescription_r1());
        educationDB.setDescription_r2(education.getDescription_r2());
        educationDB.setDescription_r3(education.getDescription_r3());
        educationDB.setDescription_r4(education.getDescription_r4());
        educationDB.setStart(education.getStart());
        educationDB.setEnd(education.getEnd());

        educationRepository.save(educationDB);

        return educationDB;
    }

    /* DeleteData */

    @Override
    public void deleteDataEducational(Integer id) {
        educationRepository.deleteById(id);
    }

}
