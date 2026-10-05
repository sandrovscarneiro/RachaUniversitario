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
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_jogador;
    @Column(nullable = false)
    private String nome;
    private Float altura;
    private Float peso;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Posicao posicao;
    private String foto; //URL
    @Column(nullable=false)
    private Boolean escalavel; //equivale ao status
}
