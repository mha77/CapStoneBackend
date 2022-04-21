package com.simplilearn.CapStone.Controller;

import com.simplilearn.CapStone.Entity.FoodItem;
import com.simplilearn.CapStone.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminFoodList {

    @Autowired
    com.simplilearn.CapStone.Service.AdminFood af;

    @CrossOrigin
    @RequestMapping(value = "/userRegister", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<String> userRegister(@RequestBody FoodItem fi) {

        boolean added = af.addFoodItem(fi);

        if(added){
            return new ResponseEntity<>("FoodItem added", HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("An Error occured", HttpStatus.BAD_REQUEST);
        }
    }
}
