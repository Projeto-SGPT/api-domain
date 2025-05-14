package com.br.sgpt.domain.entity;

import java.util.UUID;

public record User(UUID id, String username, String password, String email, String role) {
}