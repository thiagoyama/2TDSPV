package br.com.fiap.aula04.controller;

import br.com.fiap.aula04.dto.aluno.CadastroAlunoDto;
import br.com.fiap.aula04.dto.aluno.DetalhesAlunoDto;
import br.com.fiap.aula04.model.Aluno;
import br.com.fiap.aula04.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<DetalhesAlunoDto> post(@RequestBody CadastroAlunoDto alunoDto,
                                                 UriComponentsBuilder uriBuilder){
        var aluno = new Aluno(alunoDto);
        alunoRepository.save(aluno);
        var uri = uriBuilder.path("alunos/{id}").buildAndExpand(aluno.getRm()).toUri();
        return ResponseEntity.created(uri).body(new DetalhesAlunoDto(aluno));
    }

}
