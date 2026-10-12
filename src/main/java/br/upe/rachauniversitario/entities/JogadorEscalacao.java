package br.upe.rachauniversitario.entities;

import br.upe.rachauniversitario.enums.Posicao;
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
public class JogadorEscalacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJogadorEscalacao;
    @Column(nullable = false)
    private Posicao posicaoEscalada;
    @Column(nullable = false)
    private Integer slot;
    @Column(nullable = false)
    private Float pontuacaoObtida;

    @ManyToOne
    @JoinColumn(name="id_jogador")
    private Jogador jogador;

    @ManyToOne
    @JoinColumn(name="id_escalacao")
    private Escalacao escalacao;

}
