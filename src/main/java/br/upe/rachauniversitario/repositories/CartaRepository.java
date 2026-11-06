package br.upe.rachauniversitario.repositories;

import br.upe.rachauniversitario.entities.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Integer> {
   public List<Carta> findAllByOrderByOverallDesc();


}
