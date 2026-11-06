package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioCadastroRequestDTO;
import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioResponseDTO;
import br.upe.rachauniversitario.entities.Usuario;
import br.upe.rachauniversitario.repositories.UsuarioRepository;
import br.upe.rachauniversitario.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponseDTO cadastrarUsuario(UsuarioCadastroRequestDTO dto){
        if(verificarEmail(dto.email())){
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "O e-mail informado já está cadastrado no sistema."
            );
        }

        Usuario usuario = dto.toEntity();
        usuarioRepository.save(usuario);
        return UsuarioResponseDTO.fromEntity(usuario);

    }

    @Override
    public UsuarioResponseDTO buscarUsuarioEmail(String email){
        Usuario usuario = usuarioRepository.findByEmail(email);
        return UsuarioResponseDTO.fromEntity(usuario);
    }

    @Override
    public UsuarioResponseDTO buscarUsuario(Integer id){
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        return UsuarioResponseDTO.fromEntity(usuario);
    }

    @Override
    public List<UsuarioResponseDTO> buscarUsuarios(){
        return usuarioRepository.findAll().stream().map(UsuarioResponseDTO::fromEntity).toList();
    }

    public boolean verificarEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    @Override
    public void deletarUsuario(Integer idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

    @Override
    public UsuarioResponseDTO autenticarUsuario(String email, String senha){
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario != null && usuario.getSenha().equals(senha)){
            System.out.println("Autenticado");
            return UsuarioResponseDTO.fromEntity(usuario);

        }
        System.out.println("Erro");
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "E-mail ou senha inválidos");
    }

}
