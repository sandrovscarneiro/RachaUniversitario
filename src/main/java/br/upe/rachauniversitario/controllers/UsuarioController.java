package br.upe.rachauniversitario.controllers;
import br.upe.rachauniversitario.entities.Usuario;
import br.upe.rachauniversitario.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController{
    private final UsuarioService usuarioService;

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
        return usuarioService.cadastrarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id){
        return usuarioService.buscarUsuario(id);
    }
    @GetMapping("/email/{email}")
    public Usuario buscarUsuarioEmail(@PathVariable String email){
        return usuarioService.buscarUsuarioEmail(email);
    }

    @GetMapping
    public List<Usuario> BuscarUsuarios(){
        return usuarioService.buscarUsuarios();
    }




    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Integer id) {
        usuarioService.deletarUsuario(id);
    }

}
