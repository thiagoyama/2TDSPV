package br.com.fiap.aula04.repository;

import br.com.fiap.aula04.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

