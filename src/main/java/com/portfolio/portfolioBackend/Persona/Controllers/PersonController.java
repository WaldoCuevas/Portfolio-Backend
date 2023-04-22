package com.portfolio.portfolioBackend.Persona.Controllers;

//import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfolioBackend.Persona.Models.*;
import com.portfolio.portfolioBackend.Persona.ServiceImp.PersonServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
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
    public ResponseEntity<Person> addPersonalData(@RequestBody Person user) {
        return ResponseEntity.ok().body(this.personaServiceImp.addPersonalData(user));
    }

    /* ModifyData */

    @PutMapping("modifyPersonalData")
    public ResponseEntity<Person> modifyPersonalData(@RequestBody Person user) {
        return ResponseEntity.ok().body(this.personaServiceImp.modifyPersonalData(user));
    }

    /* DeleteData */

    @DeleteMapping("deletePersonalData")
    public void deletePersonalData() {
        this.personaServiceImp.deletePersonalData();
    }

}
