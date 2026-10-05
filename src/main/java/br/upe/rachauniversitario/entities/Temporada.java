package br.upe.rachauniversitario.entities;

import java.time.LocalDateTime;

public class Temporada {
    private int id_temporada;
    private String nome;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    private Boolean temporada_aberta; //equivale ao status
}
