package br.upe.rachauniversitario.entities;

import br.upe.rachauniversitario.enums.Formacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Escalacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEscalacao;
    @Column(nullable = false)
    private Formacao formacao;
    private Float pontuacao;
    @Column(nullable = false)
    private Boolean confirmada;

    @ManyToOne
    @JoinColumn(name="id_time")
    private TimeFantasy timeFantasy;

    @ManyToOne
    @JoinColumn(name="id_rodada")
    private Rodada rodada;

    @ManyToMany
    @JoinTable(
            name = "escalacao_jogador",
            joinColumns = @JoinColumn(name = "id_escalacao"),
            inverseJoinColumns = @JoinColumn(name = "id_jogador")
    )
    private List<Jogador> jogadores = new ArrayList<>();
}
