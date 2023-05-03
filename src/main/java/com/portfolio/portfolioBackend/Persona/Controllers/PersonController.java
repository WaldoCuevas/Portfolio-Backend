package com.portfolio.portfolioBackend.Persona.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfolioBackend.Persona.Models.*;
import com.portfolio.portfolioBackend.Persona.ServiceImp.PersonServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"https://waldocuevas-portfolio.web.app/"})
public class PersonController {

    @Autowired
    private PersonServiceImp personaServiceImp;

    /* ReadData */

    @GetMapping("/getPersonalData")
    public ResponseEntity<Person> getPersonalData() {
        return ResponseEntity.ok().body(this.personaServiceImp.getPersonalData());
    }

    /* AddData */

    @PostMapping("/addPersonalData")
    public ResponseEntity<Person> addPersonalData(@RequestBody Person person) {
        return ResponseEntity.ok().body(this.personaServiceImp.addPersonalData(person));
    }

    /* ModifyData */

    @PutMapping("modifyPersonalData/{id}")
    public ResponseEntity<Person> modifyPersonalData(@RequestBody Person user, @PathVariable Integer id) {
        return ResponseEntity.ok().body(this.personaServiceImp.modifyPersonalData(user,id));
    }

    /* DeleteData */

    @DeleteMapping("deletePersonalData/{id}")
    public void deletePersonalData(@PathVariable Integer id) {
        this.personaServiceImp.deletePersonalData(id);
    }

}
