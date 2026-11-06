package br.upe.rachauniversitario.DTOs.UsuarioDTOS;

import br.upe.rachauniversitario.entities.Usuario;
import br.upe.rachauniversitario.enums.Perfil;

import java.time.LocalDateTime;

public record UsuarioCadastroRequestDTO(String email, String senha, String nome, Perfil perfil, String username) {
    public Usuario toEntity(){
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setPerfil(perfil);
        usuario.setSenha(senha);
        usuario.setEmail(email);
        usuario.setUsername(username);
        usuario.setDataCadastro(LocalDateTime.now());

        return usuario;
    }
}
