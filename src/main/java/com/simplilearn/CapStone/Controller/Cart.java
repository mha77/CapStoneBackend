package com.simplilearn.CapStone.Controller;

import com.simplilearn.CapStone.Entity.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Cart {

    @Autowired
    com.simplilearn.CapStone.Service.CartService cs;

    @CrossOrigin
    @RequestMapping(value = "/getEnabledFoodList", method = RequestMethod.GET)
    List<FoodItem> getEnabledFoodList() {

        List<FoodItem> foodItemList = cs.getFoodItem();

        return foodItemList;
    }
}
