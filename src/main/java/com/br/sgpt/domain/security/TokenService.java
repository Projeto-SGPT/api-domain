package com.br.sgpt.domain.security;

import com.br.sgpt.domain.entity.Usuario;

public interface TokenService {
    String gerarToken(Usuario usuario);
}
