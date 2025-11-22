package com.example.demo.repo;

import org.springframework.stereotype.Repository;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
//public interface UserRepo extends JpaRepository<User,Integer>
public interface UserRepo extends JpaRepository<User, Integer>{
}
