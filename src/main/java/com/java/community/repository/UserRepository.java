package com.java.community.repository;

import com.java.community.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailContaining(String email);
}
