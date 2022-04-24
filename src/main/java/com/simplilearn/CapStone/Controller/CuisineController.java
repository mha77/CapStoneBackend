package com.simplilearn.CapStone.Controller;

import com.simplilearn.CapStone.Entity.Cuisine;
import com.simplilearn.CapStone.Service.CuisineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CuisineController {

    @Autowired
    CuisineService cus;

    @CrossOrigin
    @RequestMapping(value = "/addCuisine", method = RequestMethod.POST, consumes = "application/json")
    ResponseEntity<String> addFoodItem(@RequestBody Cuisine cu) {

        boolean added = cus.addCuisine(cu);

        if(added){
            return new ResponseEntity<>("Cuisine added", HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("An Error occured", HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/getCuisineList", method = RequestMethod.GET)
    List<Cuisine> getCuisineList() {

        List<Cuisine> cuisineList = cus.getCuisineList();

        return cuisineList;
    }
}
