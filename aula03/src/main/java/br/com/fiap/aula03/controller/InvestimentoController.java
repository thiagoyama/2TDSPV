package br.com.fiap.aula03.controller;

import br.com.fiap.aula03.dto.CadastroInvestimentoDto;
import br.com.fiap.aula03.dto.DetalhesInvestimentoDto;
import br.com.fiap.aula03.model.CategoriaInvestimento;
import br.com.fiap.aula03.model.Investimento;
import br.com.fiap.aula03.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("investimentos") //localhost:8080/investimentos
public class InvestimentoController {

    @Autowired //Injeção de dependencia, quando o controller for instanciado o repository tb será
    private InvestimentoRepository investimentoRepository;

    @GetMapping
    public Investimento get(){
        return new Investimento(1l, "CDI", CategoriaInvestimento.RENDA_FIXA, 100.0);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DetalhesInvestimentoDto> post(@RequestBody CadastroInvestimentoDto investimentoDto, UriComponentsBuilder uriBuilder) {
        //Instanciar um investimento com os dados do dto
        var investimento = new Investimento(investimentoDto);
        investimentoRepository.save(investimento); //cadastrar ou atualiza
        //Retornar o status code 201, o objeto criado e a url para acessar o recurso criado
        var uri = uriBuilder.path("/investimentos/{id}").buildAndExpand(investimento.getId()).toUri();
        return ResponseEntity.created(uri).body(new DetalhesInvestimentoDto(investimento));
    }

}
