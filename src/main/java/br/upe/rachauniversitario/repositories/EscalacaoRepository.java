package br.upe.rachauniversitario.repositories;

import br.upe.rachauniversitario.entities.Escalacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscalacaoRepository extends JpaRepository<Escalacao, Integer> {
}
