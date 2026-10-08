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
public class TimeFantasy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_time;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private BigDecimal orcamento;
    @Column(nullable = false)
    private Float pontuacao_total;

    @OneToOne
    @JoinColumn(name="id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="id_temporada")
    private Temporada temporada;


}
