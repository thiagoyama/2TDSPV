package br.com.fiap.aula03.dto;

import br.com.fiap.aula03.model.CategoriaInvestimento;

public record AtualizacaoInvestimentoDto(String nome, CategoriaInvestimento categoria) {
}
