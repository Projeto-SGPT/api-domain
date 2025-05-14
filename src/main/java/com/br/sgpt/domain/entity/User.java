package com.br.sgpt.domain.entity;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String username;
    private final String password;
    private final String email;
    private final String role;

    public User(UUID id, String username, String password, String email, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public UUID getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public String getEmail() { return this.email; }
    public String getRole() { return this.role; }
}