package br.upe.rachauniversitario.controllers;

import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioCadastroRequestDTO;
import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioLoginRequestDTO;
import br.upe.rachauniversitario.DTOs.UsuarioDTOS.UsuarioResponseDTO;
import br.upe.rachauniversitario.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<UsuarioResponseDTO> autenticarUsuario(@RequestBody UsuarioLoginRequestDTO dto) {
        return ResponseEntity.ok(usuarioService.autenticarUsuario(dto.email(), dto.senha()));
    }

    @PostMapping("/cadastro")
    public ResponseEntity<UsuarioResponseDTO> cadastrarUsuario(@RequestBody UsuarioCadastroRequestDTO dto){
        return ResponseEntity.ok(usuarioService.cadastrarUsuario(dto));
    }
}
