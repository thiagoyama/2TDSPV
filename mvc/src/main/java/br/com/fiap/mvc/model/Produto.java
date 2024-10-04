package br.com.fiap.mvc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="TB_TDSPV_PRODUTO")
@Getter @Setter
public class Produto {
    @Id
    @GeneratedValue
    private Long id;

    @Size(max = 80, min = 2)
    @NotBlank(message = "Nome é obrigatório")
    @Column(name="nm_produto", length = 80, nullable = false)
    private String nome;

    @NotNull(message = "Valor é obrigatório")
    @Min(value = 0, message = "Valor não pode ser negativo")
    @Column(name="vl_produto",nullable = false)
    private Double valor;

    @Size(max = 200, min = 10)
    @Column(name = "ds_produto", length = 200)
    private String descricao;

    @Past
    @Column(name = "dt_fabricacao")
    private LocalDate dataFabricacao;

    @Column(name="st_novo")
    private Boolean novo;

    @Column(name="st_produto")
    private StatusProduto status;
}
