package br.com.fiap.aula03.repository;

import br.com.fiap.aula03.model.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
}
