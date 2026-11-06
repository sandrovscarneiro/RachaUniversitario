package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.entities.Carta;
import br.upe.rachauniversitario.repositories.CartaRepository;
import br.upe.rachauniversitario.services.CartaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaServiceImpl implements CartaService {
    private final CartaRepository cartaRepository;

    @Override
    public Carta criarCarta(Carta carta){
        return cartaRepository.save(carta);
    }

    @Override
    public Carta buscarCarta(Integer id){
        return cartaRepository.findById(id).orElse(null);
    }
    @Override
    public List<Carta> buscarCartas(){return cartaRepository.findAll();};

    @Override
    public List<Carta> criarRankingCartas(){return cartaRepository.findAllByOrderByOverallDesc();};
}
