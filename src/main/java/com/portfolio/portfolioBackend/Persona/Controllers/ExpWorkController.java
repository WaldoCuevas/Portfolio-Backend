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

import com.portfolio.portfolioBackend.Persona.Models.ExpWork;
import com.portfolio.portfolioBackend.Persona.ServiceImp.ExpWorkServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"https://waldocuevas-portfolio.web.app"})
public class ExpWorkController {

    @Autowired
    private ExpWorkServiceImp expWorkServiceImp;

    /* ReadData */

    @GetMapping("/getDataWork")
    public ResponseEntity<List<ExpWork>> getDataWork() {
        return ResponseEntity.ok().body(this.expWorkServiceImp.getDataWork());
    }

    /* AddData */

    @PostMapping("/addDataWork")
    public ResponseEntity<ExpWork> addDataWork(@RequestBody ExpWork expWork) {
        return ResponseEntity.ok().body(expWorkServiceImp.addDataWork(expWork));
    }

    /* ModifyData */

    @PutMapping("modifyDataWork/{id}")
    public ResponseEntity<ExpWork> modifyDataWork(@PathVariable Integer id, @RequestBody ExpWork expWork) {
        return ResponseEntity.ok().body(this.expWorkServiceImp.modifyDataWork(id, expWork));
    }

    /* DeleteData */

    @DeleteMapping("deleteDataWork/{id}")
    public void deleteDataWork(@PathVariable Integer id) {
        this.expWorkServiceImp.deleteDataWork(id);
    }
}
