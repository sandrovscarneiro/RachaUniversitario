package br.upe.rachauniversitario.services;

import br.upe.rachauniversitario.entities.Jogador;

import java.util.List;

public interface JogadorService {
    public Jogador criarJogador(Jogador jogador);
    public List<Jogador> criarJogadores(List<Jogador> jogadores);
    public Jogador buscarJogador(Integer idJogador);
    public List<Jogador> buscarJogadores();
    public void deletarJogador(Integer idJogador);

}
