package br.com.fiap.aula04.dto.aluno;

import br.com.fiap.aula04.model.NivelEscolaridade;
import java.time.LocalDate;

public record CadastroAlunoDto(String nome, String cpf, LocalDate dataNascimento,
                                                NivelEscolaridade nivelEscolaridade, Double renda) {
}
