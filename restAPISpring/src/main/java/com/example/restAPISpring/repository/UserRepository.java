package com.example.restAPISpring.repository;

import com.example.restAPISpring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
