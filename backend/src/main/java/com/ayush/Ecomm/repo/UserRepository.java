package com.ayush.Ecomm.repo;


import com.ayush.Ecomm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
