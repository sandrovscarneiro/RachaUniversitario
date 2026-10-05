package br.upe.rachauniversitario.entities;

import br.upe.rachauniversitario.enums.Formacao;
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
public class Escalacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_escalacao;
    @Column(nullable = false)
    private Formacao formacao;
    private Float pontuacao;
    @Column(nullable = false)
    private Boolean confirmada;
}
