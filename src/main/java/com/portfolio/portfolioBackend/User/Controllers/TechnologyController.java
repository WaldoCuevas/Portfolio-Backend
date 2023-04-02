package com.portfolio.portfolioBackend.User.Controllers;

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

import com.portfolio.portfolioBackend.User.Models.Technology;
import com.portfolio.portfolioBackend.User.ServiceImp.TechnologyServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class TechnologyController {

    @Autowired
    private TechnologyServiceImp technologyServiceImp;

    /* ReadData */

    @GetMapping("/getDataTechnology")
    public ResponseEntity<List<Technology>> getDataTechnology() {
        return ResponseEntity.ok().body(this.technologyServiceImp.getDataTechnology());
    }

    /* AddData */

    @PostMapping("/addDataTechnology")
    public ResponseEntity<Technology> addDataTechnology(@RequestBody Technology technology) {
        return ResponseEntity.ok().body(technologyServiceImp.addDataTechnology(technology));
    }

    /* ModifyData */

    @PutMapping("modifyDataTechnology/{id}")
    public ResponseEntity<Technology> modifyDataTechnology(@PathVariable Integer id,
            @RequestBody Technology technology) {
        return ResponseEntity.ok().body(this.technologyServiceImp.modifyDataTechnology(id, technology));
    }

    /* DeleteData */

    @DeleteMapping("deleteDataTechnology/{id}")
    public void deleteDataTechnology(@PathVariable Integer id) {
        this.technologyServiceImp.deleteDataTechnology(id);
    }

}
