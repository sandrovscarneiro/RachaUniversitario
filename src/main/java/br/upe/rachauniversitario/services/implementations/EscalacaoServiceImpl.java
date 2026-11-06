package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.DTOs.EscalacaoDTOs.EscalacaoRequestDTO;
import br.upe.rachauniversitario.DTOs.EscalacaoDTOs.EscalacaoResponseDTO;
import br.upe.rachauniversitario.entities.Escalacao;
import br.upe.rachauniversitario.entities.Jogador;
import br.upe.rachauniversitario.repositories.EscalacaoRepository;
import br.upe.rachauniversitario.repositories.JogadorRepository;
import br.upe.rachauniversitario.repositories.TimeFantasyRepository;
import br.upe.rachauniversitario.services.EscalacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequestMapping
@RequiredArgsConstructor
public class EscalacaoServiceImpl implements EscalacaoService {
    private final EscalacaoRepository escalacaoRepository;
    private final JogadorRepository jogadorRepository;

    @Override
    public EscalacaoResponseDTO criarEscalacao(EscalacaoRequestDTO escalacaoDTO) {
        Escalacao escalacao= escalacaoDTO.toEntity();
        escalacao.setConfirmada(true);
        escalacaoRepository.save(escalacao);
        return EscalacaoResponseDTO.fromEntity(escalacao);

    }

    @Override
    public EscalacaoResponseDTO buscarEscalacaoAtual() {
        escalacaoRepository.findByRodada_RodadaAbertaTrue();
        return null;
    }

    @Override
    public void escalarJogador(Integer idJogador){
       Escalacao escalacao = escalacaoRepository.findByRodada_RodadaAbertaTrue();
       Jogador jogador = jogadorRepository.findById(idJogador).orElse(null);

        if (escalacao.getJogadores().contains(jogador)) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT, "Este jogador já está escalado."
            );
        }

        if (escalacao.getJogadores().size() == 7){
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT, "A escalação está completa."
            );
        }

        /*if (escalacao.getTimeFantasy().getOrcamento() < jogador.valor){
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT, "A escalação está completa."
            );
        }*/




        escalacao.getJogadores().add(jogador);
        escalacaoRepository.save(escalacao);


    }
}
