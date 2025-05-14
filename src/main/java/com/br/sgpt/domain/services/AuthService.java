package com.br.sgpt.domain.services;

import com.br.sgpt.domain.entity.User;

public interface AuthService {
    String generateToken(User user);
    User extractUser(String token);
}