package br.upe.rachauniversitario.DTOs.EscalacaoDTOs;

import br.upe.rachauniversitario.entities.Escalacao;
import br.upe.rachauniversitario.enums.Formacao;

public record EscalacaoRequestDTO(Formacao formacao) {
    public Escalacao toEntity() {
        Escalacao escalacao = new Escalacao();
        escalacao.setFormacao(this.formacao);
        escalacao.setConfirmada(false);
        escalacao.setPontuacao(0f);
        return escalacao;
    }
}
