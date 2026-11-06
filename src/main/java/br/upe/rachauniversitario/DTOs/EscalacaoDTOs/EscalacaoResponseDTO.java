package br.upe.rachauniversitario.DTOs.EscalacaoDTOs;

import br.upe.rachauniversitario.entities.Escalacao;
import br.upe.rachauniversitario.entities.Jogador;
import br.upe.rachauniversitario.enums.Formacao;

import java.util.Collections;
import java.util.List;

public record EscalacaoResponseDTO(Integer idEscalacao,
                                   Formacao formacao,
                                   Float pontuacao,
                                   Boolean confirmada,
                                   Integer idTime,
                                   Integer idRodada,
                                   List<Integer> idJogadores) {
    public static EscalacaoResponseDTO fromEntity(Escalacao escalacao) {
        if (escalacao == null) {
            return null;
        }

        return new EscalacaoResponseDTO(
                escalacao.getIdEscalacao(),
                escalacao.getFormacao(),
                escalacao.getPontuacao(),
                escalacao.getConfirmada(),
                escalacao.getTimeFantasy() != null ? escalacao.getTimeFantasy().getIdTime() : null,
                escalacao.getRodada() != null ? escalacao.getRodada().getIdRodada() : null,
                escalacao.getJogadores() != null
                        ? escalacao.getJogadores().stream().map(Jogador::getIdJogador).toList()
                        : Collections.emptyList()
        );

    }
}
