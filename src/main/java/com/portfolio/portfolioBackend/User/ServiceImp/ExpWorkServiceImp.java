package com.portfolio.portfolioBackend.User.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioBackend.User.Models.ExpWork;
import com.portfolio.portfolioBackend.User.Repository.ExpWorkRepository;
import com.portfolio.portfolioBackend.User.Service.ExpWorkService;

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
        expWorkDB.setDescription_r1(expWork.getDescription_r1());
        expWorkDB.setDescription_r2(expWork.getDescription_r2());
        expWorkDB.setStart(expWork.getStart());
        expWorkDB.setEnd(expWork.getEnd());

        expWorkRepository.save(expWorkDB);

        return expWorkDB;

    }

    /* DeleteData */

    @Override
    public void deleteDataWork(Integer id) {
        expWorkRepository.deleteById(id);
    }

}
