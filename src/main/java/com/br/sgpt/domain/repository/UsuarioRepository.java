package com.br.sgpt.domain.repository;

import com.br.sgpt.domain.entity.Usuario;

import java.util.Optional;
import java.util.UUID;

public interface UsuarioRepository {
    Optional<Usuario> buscarPorId(UUID id);
    Optional<Usuario> buscarPorEmail(String email);
    void salvar(Usuario usuario);
    void deletar(UUID id);
}