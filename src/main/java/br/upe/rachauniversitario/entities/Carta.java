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
    private int id_carta;
    @Column(nullable = false)
    private int overall;
    @Column(nullable = false)
    private int ataque;
    @Column(nullable = false)
    private int defesa;
    @Column(nullable = false)
    private int forca;
    @Column(nullable = false)
    private int habilidade;

    //Inserir relacionamento One to One com jogador
}
