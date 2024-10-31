package br.com.fiap.mvc.repository;

import br.com.fiap.mvc.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String nome);

}
