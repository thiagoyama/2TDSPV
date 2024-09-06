package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Disciplina;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calculadora")
public class CalculadoraController {

    @GetMapping("media")
    public String calcularMedia(){
        return "calculadora/media"; //nome da página
    }

    @PostMapping("media")
    public String calcularMedia(Disciplina disciplina, Model model){
        Double valor = disciplina.calcularMediaFinal();
        model.addAttribute("mediaFinal", valor);
        return "calculadora/media";
    }

}
