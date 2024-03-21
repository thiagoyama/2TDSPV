package br.com.fiap.aula03.controller;

import br.com.fiap.aula03.dto.AtualizacaoInvestimentoDto;
import br.com.fiap.aula03.dto.CadastroInvestimentoDto;
import br.com.fiap.aula03.dto.DetalhesInvestimentoDto;
import br.com.fiap.aula03.dto.ListagemInvestimentoDto;
import br.com.fiap.aula03.model.CategoriaInvestimento;
import br.com.fiap.aula03.model.Investimento;
import br.com.fiap.aula03.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("investimentos") //localhost:8080/investimentos
public class InvestimentoController {

    @Autowired //Injeção de dependencia, quando o controller for instanciado o repository tb será
    private InvestimentoRepository investimentoRepository;

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable("id")Long id){
        investimentoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    @Transactional
    public ResponseEntity<DetalhesInvestimentoDto> put(@PathVariable("id")Long id,
                                            @RequestBody AtualizacaoInvestimentoDto dto){
        var investimento = investimentoRepository.getReferenceById(id);
        investimento.atualizarInformacoes(dto);
        return ResponseEntity.ok(new DetalhesInvestimentoDto(investimento));
    }

    @GetMapping("{id}")
    public ResponseEntity<DetalhesInvestimentoDto> get(@PathVariable("id")Long id){
        var investimento = investimentoRepository.getReferenceById(id);
        return ResponseEntity.ok(new DetalhesInvestimentoDto(investimento));
    }

    @GetMapping
    public ResponseEntity<List<ListagemInvestimentoDto>> get(Pageable pageable){
        var listaDto = investimentoRepository.findAll(pageable)
                .stream().map(ListagemInvestimentoDto::new).toList();
        return ResponseEntity.ok(listaDto);
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
