package br.upe.rachauniversitario.repositories;

import br.upe.rachauniversitario.entities.TimeFantasy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeFantasyRepository extends JpaRepository<TimeFantasy, Integer> {
}
