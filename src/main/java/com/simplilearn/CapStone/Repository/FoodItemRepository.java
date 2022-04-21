package com.simplilearn.CapStone.Repository;

import com.simplilearn.CapStone.Entity.FoodItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodItemRepository extends CrudRepository<FoodItem, Integer> {


    FoodItem save(FoodItem fi);
    List<FoodItem> findAll();


}
