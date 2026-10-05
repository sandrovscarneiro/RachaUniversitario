package br.upe.rachauniversitario.entities;
import br.upe.rachauniversitario.enums.Perfil;
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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String username;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private LocalDateTime data_cadastro;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Perfil perfil;
}
