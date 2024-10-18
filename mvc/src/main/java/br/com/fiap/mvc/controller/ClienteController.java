package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Cliente;
import br.com.fiap.mvc.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("listar")
    public String listar(Model model){
        model.addAttribute("clientes", clienteRepository.findAll());
        return "cliente/lista";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Model model){
        model.addAttribute("cliente", new Cliente());
        return "cliente/form";
    }

    @PostMapping("cadastrar")
    @Transactional
    public String cadastrar(@Valid Cliente cliente, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors())
            return "cliente/form";
        clienteRepository.save(cliente);
        redirectAttributes.addFlashAttribute("msg", "Cliente cadastrado!");
        return "redirect:/cliente/cadastrar";
    }

}
