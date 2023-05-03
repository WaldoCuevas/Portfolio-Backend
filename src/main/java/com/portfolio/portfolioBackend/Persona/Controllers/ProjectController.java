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

import com.portfolio.portfolioBackend.Persona.Models.Project;
import com.portfolio.portfolioBackend.Persona.ServiceImp.ProjectServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"https://waldocuevas-portfolio.web.app/"})
public class ProjectController {

    @Autowired
    private ProjectServiceImp projectServiceImp;

    /* ReadData */

    @GetMapping("/getDataProject")
    public ResponseEntity<List<Project>> getDataProject() {
        return ResponseEntity.ok().body(this.projectServiceImp.getDataProject());
    }

    /* AddData */
    
    @PostMapping("/addDataProject")
    public ResponseEntity<Project> addDataProject(@RequestBody Project project) {
        return ResponseEntity.ok().body(projectServiceImp.addDataProject(project));
    }

    /* ModifyData */

    @PutMapping("modifyDataProject/{id}")
    public ResponseEntity<Project> modifyDataProject(@PathVariable Integer id, @RequestBody Project project) {
        return ResponseEntity.ok().body(this.projectServiceImp.modifyDataProject(id, project));
    }

    /* DeleteData */

    @DeleteMapping("deleteDataProject/{id}")
    public void deleteDataProject(@PathVariable Integer id) {
        this.projectServiceImp.deleteDataProject(id);
    }

}
