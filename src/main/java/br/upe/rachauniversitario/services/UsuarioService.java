package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.entities.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario cadastrarUsuario(Usuario usuario);
    public Usuario buscarUsuario(Integer id);
    public Usuario buscarUsuarioEmail(String email);
    public List<Usuario> buscarUsuarios();
    public void deletarUsuario(Integer idUsuario);
}
