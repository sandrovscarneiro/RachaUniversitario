package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.entities.Carta;
import br.upe.rachauniversitario.repositories.CartaRepository;
import br.upe.rachauniversitario.services.CartaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartaServiceImpl implements CartaService {
    private final CartaRepository cartaRepository;

    @Override
    public Carta criarCarta(Carta carta){
        return cartaRepository.save(carta);
    }
}
