package br.com.fiap.mvc.repository;

import br.com.fiap.mvc.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
