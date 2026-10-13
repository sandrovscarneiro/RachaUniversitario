package br.upe.rachauniversitario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarta;
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

    @OneToOne
    @JoinColumn(name="id_jogador", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Jogador jogador;

    public void setAll(int valor){
        this.ataque = valor;
        this.defesa = valor;
        this.forca = valor;
        this.habilidade = valor;
        this.overall = valor;
    }}
