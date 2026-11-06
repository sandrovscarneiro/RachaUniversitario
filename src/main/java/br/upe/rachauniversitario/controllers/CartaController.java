package br.upe.rachauniversitario.controllers;

import br.upe.rachauniversitario.entities.Carta;
import br.upe.rachauniversitario.services.CartaService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cartas")
public class CartaController {
    public final CartaService cartaService;
    @GetMapping
    public List<Carta> buscarCartas(){
        return cartaService.buscarCartas();
    }
    @GetMapping("/ranking")
    public List<Carta> criarRankingCartas(){
        return cartaService.criarRankingCartas();
    }
    @GetMapping("/{id}")
    public Carta buscarCarta(@PathVariable Integer id){
        return cartaService.buscarCarta(id);
    }
}
