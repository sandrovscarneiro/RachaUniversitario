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
    private Integer id_jogador_escalacao;
    @Column(nullable = false)
    private Posicao posicao_escalada;
    @Column(nullable = false)
    private Integer slot;
    @Column(nullable = false)
    private Float pontuacao_obtida;
}
