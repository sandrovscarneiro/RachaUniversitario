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
    private Integer idRodada;
    @Column(nullable = false)
    private Integer numero;
    @Column(nullable = false)
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    @Column(nullable = false)
    private Boolean rodadaAberta; //Equivale a status

    @ManyToOne
    @JoinColumn(name="id_time")
    private TimeFantasy timeFantasy;
}
