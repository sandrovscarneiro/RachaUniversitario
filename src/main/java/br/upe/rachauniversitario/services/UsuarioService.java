package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioCadastroRequestDTO;
import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioResponseDTO;

import java.util.List;

public interface UsuarioService {

    public UsuarioResponseDTO cadastrarUsuario(UsuarioCadastroRequestDTO dto);
    public UsuarioResponseDTO buscarUsuario(Integer id);
    public UsuarioResponseDTO buscarUsuarioEmail(String email);
    public List<UsuarioResponseDTO> buscarUsuarios();
    public void deletarUsuario(Integer idUsuario);
    public UsuarioResponseDTO autenticarUsuario(String email, String senha);
}
