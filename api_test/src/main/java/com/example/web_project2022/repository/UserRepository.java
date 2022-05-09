package com.example.web_project2022.repository;

import com.example.web_project2022.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
