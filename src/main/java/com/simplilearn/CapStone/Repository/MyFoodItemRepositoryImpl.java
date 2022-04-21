package com.simplilearn.CapStone.Repository;

import com.simplilearn.CapStone.Entity.FoodItem;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class MyFoodItemRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unused")
    public List<FoodItem> findEnabledFoods() {
        String hql = "FROM FoodItem as f WHERE f.enabled = true";
        TypedQuery<FoodItem> query = entityManager.createQuery(hql, FoodItem.class);
        return query.getResultList();
    }
}
