package com.portfolio.portfolioBackend.User.Controllers;

//import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfolioBackend.User.Models.*;
import com.portfolio.portfolioBackend.User.ServiceImp.UserServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    /* ReadData */

    @GetMapping("/getPersonalData")
    public ResponseEntity<User> getPersonalData() {
        return ResponseEntity.ok().body(this.userServiceImp.getPersonalData());
    }

    /* AddData */

    @PostMapping("/addPersonalData")
    public ResponseEntity<User> addPersonalData(@RequestBody User user) {
        return ResponseEntity.ok().body(userServiceImp.addPersonalData(user));
    }

    /* ModifyData */

    @PutMapping("modifyPersonalData")
    public ResponseEntity<User> modifyPersonalData(@RequestBody User user) {
        return ResponseEntity.ok().body(this.userServiceImp.modifyPersonalData(user));
    }

    /* DeleteData */

    @DeleteMapping("deletePersonalData")
    public void deletePersonalData() {
        this.userServiceImp.deletePersonalData();
    }

}
