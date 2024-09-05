package br.com.fiap.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @GetMapping("cadastrar")
    public String cadastrar(){
        return "produto/cadastro";
    }

    @PostMapping("cadastrar")
    public String churros(String nome, Double valor){
        System.out.println(nome + " " + valor);
        return "produto/cadastro";
    }

}
