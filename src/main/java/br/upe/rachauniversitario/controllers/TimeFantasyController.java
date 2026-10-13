package br.upe.rachauniversitario.controllers;

import br.upe.rachauniversitario.entities.TimeFantasy;
import br.upe.rachauniversitario.services.TimeFantasyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/times")
@RequiredArgsConstructor
public class TimeFantasyController {
    private final TimeFantasyService timeFantasyService;
    @GetMapping
    public List<TimeFantasy> buscarTimes(){
        return timeFantasyService.buscarTimes();
    }
    @GetMapping("/{id}")
    public TimeFantasy buscarTime(@PathVariable Integer id){
        return timeFantasyService.buscarTime(id);
    }
    @PostMapping
    public TimeFantasy criarTime(@RequestParam String nome, @RequestParam Integer idUsuario){
        return timeFantasyService.criarTime(nome, idUsuario);
    }
    @DeleteMapping("/{id}")
    public void deletarTime(@PathVariable Integer id){timeFantasyService.deletarTime(id);}

}
