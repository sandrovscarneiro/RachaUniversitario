package br.upe.rachauniversitario.controllers;


import br.upe.rachauniversitario.DTOs.RodadaDTOS.RodadaResponseDTO;
import br.upe.rachauniversitario.services.RodadaService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rodadas")
@RequiredArgsConstructor
public class RodadaController {
    private final RodadaService rodadaService;

    @GetMapping
    public ResponseEntity<List<RodadaResponseDTO>> buscarRodadas(){
        return ResponseEntity.ok(rodadaService.buscarRodadas());
    }
    @GetMapping("/atual")
    public ResponseEntity<RodadaResponseDTO> buscarRodadaAtual(){
        return ResponseEntity.ok(rodadaService.buscarRodadaAtual());
    }
    @PostMapping
    public ResponseEntity<RodadaResponseDTO> criarRodada(){
        return ResponseEntity.ok(rodadaService.criarRodada());
    }
}
