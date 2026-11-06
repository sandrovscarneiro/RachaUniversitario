package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.DTOs.EscalacaoDTOs.EscalacaoRequestDTO;
import br.upe.rachauniversitario.DTOs.EscalacaoDTOs.EscalacaoResponseDTO;
import br.upe.rachauniversitario.entities.Escalacao;
import br.upe.rachauniversitario.entities.Jogador;

public interface EscalacaoService {
    public EscalacaoResponseDTO buscarEscalacaoAtual();
    public void escalarJogador(Integer idJogador);
    public EscalacaoResponseDTO criarEscalacao(EscalacaoRequestDTO escalacao);
}
