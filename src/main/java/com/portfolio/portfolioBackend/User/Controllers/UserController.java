package com.portfolio.portfolioBackend.User.Controllers;

// Librerias
import java.util.*;

// Spring Anotations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

// HTTP Requets
import org.springframework.web.bind.annotation.*;

//DTO

// Entidades
import com.portfolio.portfolioBackend.User.Models.*;

//Servicios
import com.portfolio.portfolioBackend.User.Service.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    /*      ReadData     */

    @GetMapping("/getPersonalData")
    public ResponseEntity<List<User>> getPersonalData() {
        return ResponseEntity.ok().body(this.userServiceImp.getPersonalData());
    }

    @GetMapping("/getDataWork")
    public ResponseEntity<List<ExpWork>> getDataWork() {
        return ResponseEntity.ok().body(this.userServiceImp.getDataWork());
    }

    @GetMapping("/getDataEducation")
    public ResponseEntity<List<Education>> getDataEducation() {
        return ResponseEntity.ok().body(this.userServiceImp.getDataEducational());
    }

    /*      AddData    */

    @PostMapping("/addPersonalData")
    public ResponseEntity<User> addPersonalData(@RequestBody User user) {
        return ResponseEntity.ok().body(userServiceImp.addPersonalData(user));
    }

    @PostMapping("/addDataWork")
    public ResponseEntity<ExpWork> addDataWork(@RequestBody ExpWork expWork) {
        return ResponseEntity.ok().body(userServiceImp.addDataWork(expWork));
    }

    @PostMapping("/addDataEducation")
    public ResponseEntity<Education> addDataEducation(@RequestBody Education education) {
        return ResponseEntity.ok().body(userServiceImp.addDataEducational(education));
    }

    /*      ModifyData    */

    /*      DeleteData    */
    

}
