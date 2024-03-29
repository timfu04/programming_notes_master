package com.clementlee.security.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query("""
            SELECT t
            FROM Token t
            INNER JOIN User u
            ON t.user.id = u.id
            WHERE u.id = :userId and (t.expired = false or t.revoked = false)
            """)
    List<Token> findAllValidTokenByUser(Integer userId);

    Optional<Token> findByToken(String token);
}