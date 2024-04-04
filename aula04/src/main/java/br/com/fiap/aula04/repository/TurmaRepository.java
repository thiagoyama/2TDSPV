package br.com.fiap.aula04.repository;

import br.com.fiap.aula04.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
