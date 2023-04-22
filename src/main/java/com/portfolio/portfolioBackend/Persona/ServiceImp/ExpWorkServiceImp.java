package com.portfolio.portfolioBackend.Persona.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.Persona.Models.ExpWork;
import com.portfolio.portfolioBackend.Persona.Repository.ExpWorkRepository;
import com.portfolio.portfolioBackend.Persona.Service.ExpWorkService;

@Service

public class ExpWorkServiceImp implements ExpWorkService {

    @Autowired
    private ExpWorkRepository expWorkRepository;

    /* ReadData */

    @Override
    public List<ExpWork> getDataWork() {
        return expWorkRepository.findAll();

    }

    /* AddData */

    @Override
    public ExpWork addDataWork(ExpWork expWork) {
        return expWorkRepository.save(expWork);
    }

    /* ModifyData */

    @Override
    public ExpWork modifyDataWork(Integer id, ExpWork expWork) {
        ExpWork expWorkDB = expWorkRepository.findById(id).get();

        expWorkDB.setWork_image(expWork.getWork_image());
        expWorkDB.setWorkplace(expWork.getWorkplace());
        expWorkDB.setWorkstation(expWork.getWorkstation());
        expWorkDB.setJob(expWork.getJob());
        expWorkDB.setDescription_work_exp_r1(expWork.getDescription_work_exp_r1());
        expWorkDB.setDescription_work_exp_r2(expWork.getDescription_work_exp_r2());
        expWorkDB.setDescription_work_exp_r3(expWork.getDescription_work_exp_r3());
        expWorkDB.setStart_work_exp(expWork.getStart_work_exp());
        expWorkDB.setEnd_work_exp(expWork.getEnd_work_exp());

        expWorkRepository.save(expWorkDB);

        return expWorkDB;

    }

    /* DeleteData */

    @Override
    public void deleteDataWork(Integer id) {
        expWorkRepository.deleteById(id);
    }

}
