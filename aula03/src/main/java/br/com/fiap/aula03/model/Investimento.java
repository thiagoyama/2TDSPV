package br.com.fiap.aula03.model;

import br.com.fiap.aula03.dto.AtualizacaoInvestimentoDto;
import br.com.fiap.aula03.dto.CadastroInvestimentoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Investimento {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private CategoriaInvestimento categoria;

    private Double valor;

    public Investimento(CadastroInvestimentoDto investimentoDto) {
        nome = investimentoDto.nome();
        categoria = investimentoDto.categoria();
        valor = investimentoDto.valor();
    }

    public void atualizarInformacoes(AtualizacaoInvestimentoDto dto) {
        if (dto.nome() != null)
            nome = dto.nome();
        if (dto.categoria() != null)
            categoria = dto.categoria();
    }
}
