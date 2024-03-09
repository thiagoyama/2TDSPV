package br.com.fiap.aula03.controller;

import br.com.fiap.aula03.model.Usuario;
import br.com.fiap.aula03.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Usuario> post(@RequestBody Usuario usuario, UriComponentsBuilder uriBuilder) {
        usuarioRepository.save(usuario);
        var uri = uriBuilder.path("investimentos/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuario);
    }

}
