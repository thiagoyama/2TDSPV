package br.com.fiap.aula04.dto.aluno;

import br.com.fiap.aula04.model.Aluno;
import br.com.fiap.aula04.model.NivelEscolaridade;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DetalhesAlunoDto(Long rm, String nome, String cpf, LocalDate dataNascimento, LocalDateTime dataCadastro, NivelEscolaridade escolaridade, Double renda) {

    public DetalhesAlunoDto(Aluno aluno){
        this(aluno.getRm(), aluno.getNome(), aluno.getCpf(), aluno.getDataNascimento(), aluno.getDataCadastro(), aluno.getNivelEscolaridade(), aluno.getRenda());
    }

}
