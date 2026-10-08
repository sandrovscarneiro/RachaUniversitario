package br.upe.rachauniversitario.repositories;

import br.upe.rachauniversitario.entities.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporada, Integer> {
}
