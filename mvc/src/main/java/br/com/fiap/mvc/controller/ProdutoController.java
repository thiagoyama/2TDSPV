package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Produto;
import br.com.fiap.mvc.model.StatusProduto;
import br.com.fiap.mvc.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("remover")
    @Transactional
    public String remover(Long codigo, RedirectAttributes redirectAttributes) {
        produtoRepository.deleteById(codigo);
        redirectAttributes.addFlashAttribute("mensagem", "Produto removido");
        return "redirect:/produto/listar";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Produto produto, Model model){
        model.addAttribute("status", StatusProduto.values());
        return "produto/cadastro";
    }

    @PostMapping("cadastrar")
    @Transactional
    public String churros(@Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes, Model model){
        if (result.hasErrors()) {
            model.addAttribute("status", StatusProduto.values());
            return "produto/cadastro"; //se tiver erro de validação, retorna para a página de cadastro
        }
        produtoRepository.save(produto);
        redirectAttributes.addFlashAttribute("mensagem", "Produto cadastrado!");
        return "redirect:/produto/cadastrar";
    }

    @GetMapping("listar")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto/listar";
    }

    @GetMapping("editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("produto", produtoRepository.findById(id));
        model.addAttribute("status", StatusProduto.values());
        return "produto/editar";
    }

    @PostMapping("editar")
    public String editar(@Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes, Model model){
        if (result.hasErrors()) {
            model.addAttribute("status", StatusProduto.values());
            return "produto/editar"; //se tiver erro de validação, retorna para a página de cadastro
        }
        produtoRepository.save(produto);
        redirectAttributes.addFlashAttribute("mensagem", "Produto atualizado");
        return "redirect:/produto/listar";
    }

}
