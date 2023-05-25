package com.portfolio.portfolioBackend.Persona.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfolioBackend.Persona.Models.Education;
import com.portfolio.portfolioBackend.Persona.ServiceImp.EducationServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"https://waldocuevas-portfolio.web.app/"})

public class EducationController {

    @Autowired
    private EducationServiceImp educationServiceImp;

    /* ReadData */

    @GetMapping("/getDataEducation")
    public ResponseEntity<List<Education>> getDataEducation() {
        return ResponseEntity.ok().body(this.educationServiceImp.getDataEducational());
    }

    /* AddData */

    @PostMapping("/addDataEducation")
    public ResponseEntity<Education> addDataEducation(@RequestBody Education education) {
        return ResponseEntity.ok().body(educationServiceImp.addDataEducational(education));
    }

    /* ModifyData */

    @PutMapping("modifyDataEducation/{id}")
    public ResponseEntity<Education> modifyDataEducation(@PathVariable Integer id, @RequestBody Education education) {
        return ResponseEntity.ok().body(this.educationServiceImp.modifyDataEducational(id, education));
    }

    /* DeleteData */

    @DeleteMapping("deleteDataEducation/{id}")
    public void deleteDataEducation(@PathVariable Integer id) {
        this.educationServiceImp.deleteDataEducational(id);
    }

}
