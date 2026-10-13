package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.entities.Temporada;

import java.util.List;

public interface TemporadaService {
    public Temporada criarTemporada(Temporada temporada);
    public List<Temporada> buscarTemporadas();
}
