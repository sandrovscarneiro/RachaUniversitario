package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.entities.Carta;

import java.util.List;

public interface CartaService {
    public Carta criarCarta(Carta carta);
    public Carta buscarCarta(Integer id);
    public List<Carta> buscarCartas();
    public List<Carta> criarRankingCartas();
}
