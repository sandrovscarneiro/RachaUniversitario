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
    private Integer id_rodada_jogador;
    @Column(nullable = false)
    private Float pontos;
    @Column(nullable = false)
    private BigDecimal valor_rucoin;
}
