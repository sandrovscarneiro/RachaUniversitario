package br.upe.rachauniversitario.controllers;

import br.upe.rachauniversitario.entities.Jogador;
import br.upe.rachauniversitario.services.JogadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
@RequiredArgsConstructor
public class JogadorController {
    private final JogadorService jogadorService;
    @GetMapping
    public List<Jogador> buscarJogadores(){
        return jogadorService.buscarJogadores();
    }
    @GetMapping("/{id}")
    public Jogador buscarJogador(@PathVariable Integer id){
        return jogadorService.buscarJogador(id);
    }
    @PostMapping
    public Jogador criarJogador(@RequestBody Jogador jogador){
        return jogadorService.criarJogador(jogador);
    }
    @PostMapping("/bulk")
    public List<Jogador> criarJogadores(@RequestBody List<Jogador> jogadores){
        return jogadorService.criarJogadores(jogadores);
    }
    @DeleteMapping("/{id}")
    public void deletarJogador(@PathVariable Integer id){
        jogadorService.deletarJogador(id);
    }
}
