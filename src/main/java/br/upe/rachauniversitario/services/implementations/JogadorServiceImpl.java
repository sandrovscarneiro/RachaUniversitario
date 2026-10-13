package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.entities.Carta;
import br.upe.rachauniversitario.entities.Jogador;
import br.upe.rachauniversitario.entities.Usuario;
import br.upe.rachauniversitario.repositories.CartaRepository;
import br.upe.rachauniversitario.repositories.JogadorRepository;
import br.upe.rachauniversitario.services.JogadorService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogadorServiceImpl implements JogadorService {
    private final JogadorRepository jogadorRepository;
    private final CartaRepository cartaRepository;
    @Override
    @Transactional
    public Jogador criarJogador(Jogador jogador){
        Jogador jogadorSalvo = jogadorRepository.save(jogador);
        Carta carta = new Carta();
        carta.setAll(50);
        carta.setJogador(jogadorSalvo);
        cartaRepository.save(carta);
        return jogadorSalvo;
    }
    @Override
    public List<Jogador> criarJogadores(List<Jogador> jogadores){
        List<Jogador> jogadoresSalvos = jogadorRepository.saveAll(jogadores);
        for(Jogador jogadorSalvo:jogadoresSalvos){
            Carta carta = new Carta();
            carta.setAll(50);
            carta.setJogador(jogadorSalvo);
            cartaRepository.save(carta);
        }
        return jogadoresSalvos;
    }

    @Override
    public Jogador buscarJogador(Integer idJogador){
        return jogadorRepository.findById(idJogador).orElse(null);
    }

    @Override
    public List<Jogador> buscarJogadores(){
        return jogadorRepository.findAll();
    }

    @Override
    public void deletarJogador(Integer idJogador){
        jogadorRepository.deleteById(idJogador);
    }

}

