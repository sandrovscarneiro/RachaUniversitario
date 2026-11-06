package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.DTOs.RodadaDTOS.RodadaResponseDTO;
import br.upe.rachauniversitario.entities.Rodada;
import br.upe.rachauniversitario.repositories.RodadaRepository;
import br.upe.rachauniversitario.services.RodadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RodadaServiceImpl implements RodadaService {
    final RodadaRepository rodadaRepository;
    public List<RodadaResponseDTO> buscarRodadas(){
        return rodadaRepository.findAll().stream().map(RodadaResponseDTO::fromEntity).toList();
    }
    public RodadaResponseDTO buscarRodadaAtual(){
        Rodada rodada = rodadaRepository.findByRodadaAberta(true);
        if(rodada == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhuma rodada aberta no momento.");
        }
        return RodadaResponseDTO.fromEntity(rodada);
    }

    public RodadaResponseDTO criarRodada(){
        Rodada rodadaAtual = rodadaRepository.findByRodadaAberta(true);
        if(rodadaAtual != null){
            rodadaAtual.setRodadaAberta(false);
            rodadaAtual.setDataFim(LocalDateTime.now());
            rodadaRepository.save(rodadaAtual);
        }
        Rodada novaRodada = new Rodada();
        novaRodada.setDataInicio(LocalDateTime.now());
        novaRodada.setNumero(rodadaRepository.findMaxNumero()+1);
        novaRodada.setRodadaAberta(true);
        rodadaRepository.save(novaRodada);
        return RodadaResponseDTO.fromEntity(novaRodada);
    }
}
