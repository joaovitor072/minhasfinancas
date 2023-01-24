package com.dsousa.minhasfinancas.service;

import com.dsousa.minhasfinancas.model.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UsuarioService {

    Usuario autenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);

    Optional<Usuario> obterPorId(Long id);
}