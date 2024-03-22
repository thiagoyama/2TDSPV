package br.com.fiap.aula04.controller;

import br.com.fiap.aula04.dto.aluno.CadastroAlunoDto;
import br.com.fiap.aula04.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    public ResponseEntity<DetalhesAlunoDto> post(@RequestBody CadastroAlunoDto alunoDto,
                                                                UriComponentsBuilder uriBuilder){
        //Finalizar o POST, e tb e implementar o CRUD completo
    }

}
