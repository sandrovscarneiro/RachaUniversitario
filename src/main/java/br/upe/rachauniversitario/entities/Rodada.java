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
public class Rodada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_rodada;
    @Column(nullable = false)
    private Integer numero;
    @Column(nullable = false)
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;
    @Column(nullable = false)
    private Boolean rodada_aberta; //Equivale a status

    @ManyToOne
    @JoinColumn(name="id_time")
    TimeFantasy timeFantasy;
}
