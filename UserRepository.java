package com.rasool.design.shark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rasool.design.shark.model.User;

public interface UserRepository extends  JpaRepository<User,Long>{
    User findByUsername(String username);
}
