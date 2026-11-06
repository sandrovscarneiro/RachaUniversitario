package br.upe.rachauniversitario.DTOs.TemporadaDTOs;

import br.upe.rachauniversitario.entities.Temporada;

import java.time.LocalDateTime;

public record TemporadaResponseDTO(Integer idTemporada, LocalDateTime dataInicio, LocalDateTime dataFim, String nome, Boolean temporadaAberta) {

    public static TemporadaResponseDTO fromEntity(Temporada temporada){
        return new TemporadaResponseDTO(
                temporada.getIdTemporada(),
                temporada.getDataInicio(),
                temporada.getDataFim(),
                temporada.getNome(),
                temporada.getTemporadaAberta()
        );
    }
}
