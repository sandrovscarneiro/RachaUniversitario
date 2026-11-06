package br.upe.rachauniversitario.repositories;

import br.upe.rachauniversitario.entities.Rodada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RodadaRepository extends JpaRepository<Rodada, Integer> {
    public Rodada findByRodadaAberta(Boolean rodadaAberta);

    @Query("SELECT COALESCE(MAX(r.numero), 0) FROM Rodada r")
    Integer findMaxNumero();
}
