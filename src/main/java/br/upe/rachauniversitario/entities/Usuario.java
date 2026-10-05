package br.upe.rachauniversitario.entities;
import br.upe.rachauniversitario.Perfil;
import java.time.LocalDateTime;

public class Usuario {
    private Integer id_usuario;
    private String nome;
    private String username;
    private String email;
    private String senha;
    private LocalDateTime data_cadastro;
    private Perfil perfil;
}
