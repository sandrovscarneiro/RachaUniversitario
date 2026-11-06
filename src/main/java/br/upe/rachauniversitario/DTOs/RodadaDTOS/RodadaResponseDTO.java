package br.upe.rachauniversitario.DTOs.RodadaDTOS;

import br.upe.rachauniversitario.entities.Rodada;
import br.upe.rachauniversitario.entities.TimeFantasy;

import java.time.LocalDateTime;

public record RodadaResponseDTO(Integer idRodada, LocalDateTime dataInicio, LocalDateTime dataFim, Integer numero, boolean rodadaAberta, TimeFantasy time) {
    public static RodadaResponseDTO fromEntity(Rodada rodada){
        return new RodadaResponseDTO(
        rodada.getIdRodada(),
        rodada.getDataInicio(),
        rodada.getDataFim(),
        rodada.getNumero(),
        rodada.getRodadaAberta(),
        rodada.getTimeFantasy()
        );
    }
}
