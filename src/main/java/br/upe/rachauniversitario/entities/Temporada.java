package br.upe.rachauniversitario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_temporada;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    @Column(nullable = false)
    private Boolean temporada_aberta; //equivale ao status
}
