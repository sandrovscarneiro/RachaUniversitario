package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.entities.TimeFantasy;

import java.util.List;

public interface TimeFantasyService {
    public TimeFantasy criarTime(String nome, Integer idUsuario);
    public TimeFantasy buscarTime(Integer idTime);
    public List<TimeFantasy> buscarTimes();
    public void deletarTime(Integer idTime);

}
