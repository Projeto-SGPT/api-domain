package com.br.sgpt.domain.security;

public interface Hasher {
    String hash(String senha);
    boolean verificar(String senha, String hash);
}
