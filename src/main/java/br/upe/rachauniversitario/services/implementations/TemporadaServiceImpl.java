package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.DTOs.TemporadaDTOs.TemporadaResponseDTO;
import br.upe.rachauniversitario.entities.Temporada;
import br.upe.rachauniversitario.repositories.TemporadaRepository;
import br.upe.rachauniversitario.services.TemporadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TemporadaServiceImpl implements TemporadaService {
    private final TemporadaRepository temporadaRepository;
    @Override
    public TemporadaResponseDTO criarTemporada(String nomeTemporada){
        Temporada temporadaAtual = temporadaRepository.findByTemporadaAberta(true);
        if(temporadaAtual != null){
            temporadaAtual.setTemporadaAberta(false);
            temporadaAtual.setDataFim(LocalDateTime.now());
            temporadaRepository.save(temporadaAtual);
        }

        Temporada temporada = new Temporada();
        temporada.setDataInicio(LocalDateTime.now());
        temporada.setTemporadaAberta(true);
        temporada.setNome(nomeTemporada);

        temporadaRepository.save(temporada);

        return TemporadaResponseDTO.fromEntity(temporada);
    }

    public TemporadaResponseDTO buscarTemporadaAtual(){
        Temporada temporadaAtual = temporadaRepository.findByTemporadaAberta(true);
        if(temporadaAtual == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhuma temporada aberta no momento.");
        }
        return TemporadaResponseDTO.fromEntity(temporadaAtual);
    }

    @Override
    public List<TemporadaResponseDTO> buscarTemporadas(){
        return temporadaRepository.findAll().stream().map(TemporadaResponseDTO::fromEntity).toList();
    }
}
