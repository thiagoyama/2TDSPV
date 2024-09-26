package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Produto;
import br.com.fiap.mvc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("cadastrar")
    public String cadastrar(Produto produto){
        return "produto/cadastro";
    }

    @PostMapping("cadastrar")
    @Transactional
    public String churros(Produto produto, Model model){
        produtoRepository.save(produto);
        model.addAttribute("mensagem", "Produto cadastrado!");
        return "produto/cadastro";
    }

    @GetMapping("listar")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto/listar";
    }

    @GetMapping("editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("produto", produtoRepository.findById(id));
        return "produto/editar";
    }

    @PostMapping("editar")
    public String editar(Produto produto, Model model){
        produtoRepository.save(produto);
        model.addAttribute("mensagem", "Produto atualizado");
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto/listar";
    }

}
