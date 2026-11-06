package br.upe.rachauniversitario.services;


import br.upe.rachauniversitario.DTOs.RodadaDTOS.RodadaResponseDTO;

import java.util.List;

public interface RodadaService {
    public RodadaResponseDTO buscarRodadaAtual();
    public RodadaResponseDTO criarRodada();
    public List<RodadaResponseDTO> buscarRodadas();
}
