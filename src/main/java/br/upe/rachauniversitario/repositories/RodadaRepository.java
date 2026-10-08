package br.upe.rachauniversitario.repositories;

import br.upe.rachauniversitario.entities.Rodada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RodadaRepository extends JpaRepository<Rodada, Integer> {
}
