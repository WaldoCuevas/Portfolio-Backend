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

import com.portfolio.portfolioBackend.User.Models.Skill;
import com.portfolio.portfolioBackend.User.ServiceImp.SkillServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class SkillController {

    @Autowired
    private SkillServiceImp skillServiceImp;

    /* ReadData */

    @GetMapping("/getDataSkill")
    public ResponseEntity<List<Skill>> getDataSkill() {
        return ResponseEntity.ok().body(this.skillServiceImp.getDataSkill());
    }

    /* AddData */

    @PostMapping("/addDataSkill")
    public ResponseEntity<Skill> addDataSkill(@RequestBody Skill skill ) {
        return ResponseEntity.ok().body(skillServiceImp.addDataSkill(skill));
    }

    /* ModifyData */

    @PutMapping("modifyDataSkill/{id}")
    public ResponseEntity<Skill> modifyDataSkill(@PathVariable Integer id,
            @RequestBody Skill skill) {
        return ResponseEntity.ok().body(this.skillServiceImp.modifyDataSkill(id, skill));
    }

    /* DeleteData */

    @DeleteMapping("deleteDataSkill/{id}")
    public void deleteDataSkill(@PathVariable Integer id) {
        this.skillServiceImp.deleteDataSkill(id);
    }

}
