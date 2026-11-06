package br.upe.rachauniversitario.controllers;

import br.upe.rachauniversitario.DTOs.TemporadaDTOs.TemporadaResponseDTO;
import br.upe.rachauniversitario.entities.Temporada;
import br.upe.rachauniversitario.services.TemporadaService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temporadas")
@RequiredArgsConstructor
public class TemporadaController {
    private final TemporadaService temporadaService;
    @GetMapping
    public ResponseEntity<List<TemporadaResponseDTO>> buscarTemporadas(){
        return ResponseEntity.ok(temporadaService.buscarTemporadas());
    }
    @GetMapping("/atual")
    public ResponseEntity<TemporadaResponseDTO> buscarTemporadaAtual(){
        return ResponseEntity.ok(temporadaService.buscarTemporadaAtual());
    }
    @PostMapping
    public ResponseEntity<TemporadaResponseDTO> criarTemporada(@RequestBody String nome){
        return ResponseEntity.ok(temporadaService.criarTemporada(nome));
    }
}
