package br.com.fiap.aula04.dto.aluno;

import br.com.fiap.aula04.model.NivelEscolaridade;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record CadastroAlunoDto(
        @NotBlank
        @Size(max = 100)
        String nome,
        @NotBlank(message = "CPF obrigatório")
        @Size(max=11, min = 11)
        String cpf,
        @NotNull
        @Past(message = "Data de nascimento deve estar no passado")
        LocalDate dataNascimento,
        @NotNull
        NivelEscolaridade nivelEscolaridade,
        @PositiveOrZero
        Double renda) {
}
