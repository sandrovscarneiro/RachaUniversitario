package br.upe.rachauniversitario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RodadaJogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRodadaJogador;
    @Column(nullable = false)
    private Float pontos;
    @Column(nullable = false)
    private BigDecimal valor_rucoin;

    @ManyToOne
    @JoinColumn(name="id_rodada")
    private Rodada rodada;

    @ManyToOne
    @JoinColumn(name="id_jogador")
    private Jogador jogador;
}
