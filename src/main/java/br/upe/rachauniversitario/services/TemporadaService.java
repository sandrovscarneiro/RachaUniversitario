package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.DTOs.TemporadaDTOs.TemporadaResponseDTO;
import br.upe.rachauniversitario.entities.Temporada;

import java.util.List;

public interface TemporadaService {
    public TemporadaResponseDTO criarTemporada(String nomeTemporada);
    public List<TemporadaResponseDTO> buscarTemporadas();
    public TemporadaResponseDTO buscarTemporadaAtual();
}
