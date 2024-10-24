package br.com.fiap.mvc.service;

import br.com.fiap.mvc.model.Role;
import br.com.fiap.mvc.model.Usuario;
import br.com.fiap.mvc.repository.RoleRepository;
import br.com.fiap.mvc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RoleRepository roleRepository;

    //Salvar um usuário no banco
    public void salvar(String username, String password, List<String> roles){
        List<Role> listaRoles = new ArrayList<>();
        for (String nome : roles){
            Role role = roleRepository.findByNome(nome);
            if (role != null) listaRoles.add(role);
        }
        Usuario usuario = new Usuario(username, password, listaRoles);
        usuarioRepository.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
