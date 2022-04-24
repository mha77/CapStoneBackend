package com.simplilearn.CapStone.Service;

import com.simplilearn.CapStone.Entity.Cuisine;
import com.simplilearn.CapStone.Repository.CuisineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuisineService {

    @Autowired
    CuisineRepository cr;

    public boolean addCuisine(Cuisine fi){
        cr.save(fi);
        return true;
    }

    public List<Cuisine> getCuisineList(){

        List<Cuisine> cl = cr.findAll();
        return cl;
    }
}
