package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.entities.Temporada;
import br.upe.rachauniversitario.repositories.TemporadaRepository;
import br.upe.rachauniversitario.services.TemporadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TemporadaServiceImpl implements TemporadaService {
    private final TemporadaRepository temporadaRepository;
    @Override
    public Temporada criarTemporada(Temporada temporada){
        temporada.setDataInicio(LocalDateTime.now());
        return temporadaRepository.save(temporada);
    }

    @Override
    public List<Temporada> buscarTemporadas(){
        return temporadaRepository.findAll();
    }
}
