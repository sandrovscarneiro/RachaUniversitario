package br.upe.rachauniversitario.controllers;

import br.upe.rachauniversitario.DTOs.EscalacaoDTOs.EscalacaoRequestDTO;
import br.upe.rachauniversitario.DTOs.EscalacaoDTOs.EscalacaoResponseDTO;
import br.upe.rachauniversitario.entities.Escalacao;
import br.upe.rachauniversitario.services.EscalacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/escalacoes")
@RequiredArgsConstructor
public class EscalacaoController {
    private final EscalacaoService escalacaoService;

    @GetMapping
    public EscalacaoResponseDTO buscarEscalacaoAtual(){
        return escalacaoService.buscarEscalacaoAtual();
    }

    @PostMapping("/{idJogador}")
    public void escalarJogador(@PathVariable Integer idJogador){
        escalacaoService.escalarJogador(idJogador);
    }

    @PostMapping
    public EscalacaoResponseDTO criarEscalacao(EscalacaoRequestDTO escalacaoDto){
        return escalacaoService.criarEscalacao(escalacaoDto);
    }
}
