package br.upe.rachauniversitario.controllers;
import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioResponseDTO;
import br.upe.rachauniversitario.entities.Usuario;
import br.upe.rachauniversitario.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController{
    private final UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> buscarUsuario(@PathVariable Integer id){
        return ResponseEntity.ok(usuarioService.buscarUsuario(id));
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<UsuarioResponseDTO> buscarUsuarioEmail(@PathVariable String email){
        return ResponseEntity.ok(usuarioService.buscarUsuarioEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> BuscarUsuarios(){
        return ResponseEntity.ok(usuarioService.buscarUsuarios());
    }




    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Integer id) {
        usuarioService.deletarUsuario(id);
    }

}
