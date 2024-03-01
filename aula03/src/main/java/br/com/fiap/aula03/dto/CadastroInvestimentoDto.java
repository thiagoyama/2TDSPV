package br.com.fiap.aula03.dto;

import br.com.fiap.aula03.model.CategoriaInvestimento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class CadastroInvestimentoDto {

    private String nome;

    private CategoriaInvestimento categoria;

    private Double valor;

}
