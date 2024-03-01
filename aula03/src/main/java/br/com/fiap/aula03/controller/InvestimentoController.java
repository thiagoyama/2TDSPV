package br.com.fiap.aula03.controller;

import br.com.fiap.aula03.model.CategoriaInvestimento;
import br.com.fiap.aula03.model.Investimento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("investimentos") //localhost:8080/investimentos
public class InvestimentoController {

    @GetMapping
    public Investimento get(){
        return new Investimento("CDI", CategoriaInvestimento.RENDA_FIXA, 100.0);
    }

    @PostMapping
    public ResponseEntity<Investimento> post(@RequestBody Investimento investimento, UriComponentsBuilder uriBuilder) {
        System.out.println(investimento.getNome());
        //Retornar o status code 201, o objeto criado e a url para acessar o recurso criado
        var uri = uriBuilder.path("/investimentos/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body(investimento);
    }

}
