package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.dto.UseForm;
import br.com.fiap.mvc.repository.RoleRepository;
import br.com.fiap.mvc.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("registrar")
    public String cadastrar(Model model){
        model.addAttribute("usuario", new UseForm());
        model.addAttribute("roles", roleRepository.findAll());
        return "usuario/form";
    }

}
