package br.com.fiap.aula03.repository;

import br.com.fiap.aula03.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
