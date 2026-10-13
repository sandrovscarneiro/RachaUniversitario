package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.entities.Usuario;
import br.upe.rachauniversitario.repositories.UsuarioRepository;
import br.upe.rachauniversitario.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario cadastrarUsuario(Usuario usuario){
        if(verificarEmail(usuario.getEmail())){
            return null;
        }

        usuario.setDataCadastro(LocalDateTime.now());

        return usuarioRepository.save(usuario);

    }

    @Override
    public Usuario buscarUsuarioEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public Usuario buscarUsuario(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> buscarUsuarios(){
        return usuarioRepository.findAll();
    }

    public boolean verificarEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    @Override
    public void deletarUsuario(Integer idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

}
