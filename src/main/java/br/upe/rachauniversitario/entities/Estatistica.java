package br.upe.rachauniversitario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Estatistica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estatistica;
    @Column(nullable = false)
    private Integer gols;
    @Column(nullable = false)
    private Integer assistencias;
    @Column(nullable = false)
    private Integer defesas;
    @Column(nullable = false)
    private Integer cartoes_amarelos;
    @Column(nullable = false)
    private Integer cartoes_vermelhos;

    @OneToOne
    @JoinColumn(name="id_rodada_jogador", nullable = false)
    private RodadaJogador rodada_jogador;

}
