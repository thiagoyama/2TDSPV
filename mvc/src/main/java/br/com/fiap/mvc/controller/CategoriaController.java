package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Categoria;
import br.com.fiap.mvc.repository.CategoriaRepository;
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
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public String index(Model model){
        model.addAttribute("categoria", new Categoria());
        model.addAttribute("lista", categoriaRepository.findAll());
        return "categoria/index";
    }

    @PostMapping("cadastrar")
    @Transactional
    public String cadastrar(@Valid Categoria categoria, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("lista", categoriaRepository.findAll());
            return "categoria/index";
        }
        categoriaRepository.save(categoria);
        redirectAttributes.addFlashAttribute("mensagem", "Categoria registrada");
        return "redirect:/categoria";
    }

}
