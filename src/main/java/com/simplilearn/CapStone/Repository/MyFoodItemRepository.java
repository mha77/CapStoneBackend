package com.simplilearn.CapStone.Repository;

import com.simplilearn.CapStone.Entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyFoodItemRepository extends JpaRepository<FoodItem, Integer> {
    // EXAMPLE SPRING DATA METHOD
    List<FoodItem> findEnabledFoods();
}