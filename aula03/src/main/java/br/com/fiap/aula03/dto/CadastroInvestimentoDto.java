package br.com.fiap.aula03.dto;

import br.com.fiap.aula03.model.CategoriaInvestimento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public record CadastroInvestimentoDto(String nome, CategoriaInvestimento categoria, Double valor) {

}
