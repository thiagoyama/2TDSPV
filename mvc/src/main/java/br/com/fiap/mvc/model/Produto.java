package br.com.fiap.mvc.model;

import jakarta.persistence.*;
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
    @Column(name="nm_produto", length = 80, nullable = false)
    private String nome;
    @Column(name="vl_produto",nullable = false)
    private Double valor;
    @Column(name = "ds_produto", length = 200)
    private String descricao;
    @Column(name = "dt_fabricacao")
    private LocalDate dataFabricacao;
    @Column(name="st_novo")
    private Boolean novo;
}
