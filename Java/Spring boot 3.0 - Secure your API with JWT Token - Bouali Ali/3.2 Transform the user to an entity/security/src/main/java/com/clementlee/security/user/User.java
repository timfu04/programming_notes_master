package com.clementlee.security.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user") // specify another name since "user"(default name) is reserved keyword in PostgreSQL
public class User {

    @Id
    @GeneratedValue// AUTO by default
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
