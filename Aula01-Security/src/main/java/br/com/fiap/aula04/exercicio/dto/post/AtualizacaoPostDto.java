package br.com.fiap.aula04.exercicio.dto.post;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

@Schema(description = "Dados para atualizar um post")
public record AtualizacaoPostDto(
        @Schema(description = "Título do Post", maxLength = 50)
        @Size(max = 50)
        String titulo,
        @Schema(description = "Conteúdo do Post")
        @Size(max = 500)
        String conteudo,
        @Size(max = 50)
        @Schema(description = "Nome do autor do Post")
        String autor) {
}
