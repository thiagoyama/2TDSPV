package br.com.fiap.aula04.repository;

import br.com.fiap.aula04.model.Carteirinha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteirinhaRepository extends JpaRepository<Carteirinha, Long> {
}
