package com.br.sgpt.domain.usecases.auth;

public interface AuthUseCase {
    String login(String username, String password);
    void register(String username, String password, String email, String role);
}
