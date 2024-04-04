package br.com.fiap.aula04.repository;

import br.com.fiap.aula04.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
