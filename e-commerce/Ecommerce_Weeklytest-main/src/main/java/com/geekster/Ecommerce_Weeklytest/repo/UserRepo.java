package com.geekster.Ecommerce_Weeklytest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.Ecommerce_Weeklytest.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}

