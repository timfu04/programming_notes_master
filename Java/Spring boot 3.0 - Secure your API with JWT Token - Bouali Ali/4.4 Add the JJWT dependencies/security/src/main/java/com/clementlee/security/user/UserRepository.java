package com.clementlee.security.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    // Derived query methods
    // Find user by email
    Optional<User> findByEmail(String email);

}
