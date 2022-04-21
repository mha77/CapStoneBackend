package com.simplilearn.CapStone.Service;

import com.simplilearn.CapStone.Entity.FoodItem;
import com.simplilearn.CapStone.Repository.FoodItemRepository;
import com.simplilearn.CapStone.Repository.MyFoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    MyFoodItemRepository mfi;

    public List<FoodItem> getFoodItem(){
        List<FoodItem> foodItemList;
        foodItemList = mfi.findEnabledFoods();

        return foodItemList;

    }
}
