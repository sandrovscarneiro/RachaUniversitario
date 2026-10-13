package br.upe.rachauniversitario.controllers;

import br.upe.rachauniversitario.entities.Temporada;
import br.upe.rachauniversitario.services.TemporadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temporadas")
@RequiredArgsConstructor
public class TemporadaController {
    private final TemporadaService temporadaService;
    @GetMapping
    public List<Temporada> buscarTemporadas(){
        return temporadaService.buscarTemporadas();
    }
    @PostMapping
    public Temporada criarTemporada(@RequestBody Temporada temporada){
        return temporadaService.criarTemporada(temporada);
    }
}
