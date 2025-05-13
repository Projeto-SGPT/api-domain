package com.br.sgpt.domain.entity;

import com.br.sgpt.domain.security.Hasher;

import java.util.UUID;

public class Usuario {

    private final UUID id;
    private final String nome;
    private final String email;
    private final String senhaHash;

    public Usuario(UUID id, String nome, String email, String senhaHash) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senhaHash = senhaHash;
    }

    public boolean senhaCorreta(String senha, Hasher hasher) {
        return hasher.verificar(senha, senhaHash);
    }

    public UUID getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenhaHash() { return senhaHash; }
}