package com.portfolio.portfolioBackend.User.Controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfolioBackend.User.Models.*;
import com.portfolio.portfolioBackend.User.Service.*;
import com.portfolio.portfolioBackend.User.ServiceImp.UserServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    /* ReadData */

    @GetMapping("/getPersonalData/{id}")
    public ResponseEntity<List<User>> getPersonalData(@PathVariable Integer id) {
        return ResponseEntity.ok().body(this.userServiceImp.getPersonalData(id));
    }

    /* AddData */

    @PostMapping("/addPersonalData")
    public ResponseEntity<User> addPersonalData(@RequestBody User user) {
        return ResponseEntity.ok().body(userServiceImp.addPersonalData(user));
    }

    /* ModifyData */

    @PutMapping("modifyPersonalData/{id}")
    public ResponseEntity<User> modifyPersonalData(@PathVariable Integer id, @RequestBody User user) {
        return ResponseEntity.ok().body(this.userServiceImp.modifyPersonalData(id, user));
    }

    /* DeleteData */

    @DeleteMapping("deletePersonalData/{id}")
    public void deletePersonalData(@PathVariable Integer id) {
        this.userServiceImp.deletePersonalData(id);
    }

}
