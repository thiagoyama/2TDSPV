package br.com.fiap.mvc.repository;

import br.com.fiap.mvc.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long > {
}
