package com.simplilearn.CapStone.Repository;

import com.simplilearn.CapStone.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

        List<User> findAll();
        User save(User user);


}
