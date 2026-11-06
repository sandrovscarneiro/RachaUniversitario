package br.upe.rachauniversitario.DTOs.UsuarioDTOS;

import br.upe.rachauniversitario.entities.Usuario;
import br.upe.rachauniversitario.enums.Perfil;

import java.time.LocalDateTime;

public record UsuarioResponseDTO(Integer idUsuario, LocalDateTime data_cadastro, String email, String nome, Perfil perfil, String username) {
    public static UsuarioResponseDTO fromEntity(Usuario usuario){
        if(usuario == null){
            return null;
        }
        return new UsuarioResponseDTO(
                usuario.getIdUsuario(),
                usuario.getDataCadastro(),
                usuario.getEmail(),
                usuario.getNome(),
                usuario.getPerfil(),
                usuario.getUsername()
        );
    }
}
