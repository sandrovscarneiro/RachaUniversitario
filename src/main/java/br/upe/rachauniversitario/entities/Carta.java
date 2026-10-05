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
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_carta;
    @Column(nullable = false)
    private Integer overall;
    @Column(nullable = false)
    private Integer ataque;
    @Column(nullable = false)
    private Integer defesa;
    @Column(nullable = false)
    private Integer forca;
    @Column(nullable = false)
    private Integer habilidade;

    //Inserir relacionamento One to One com jogador
}
