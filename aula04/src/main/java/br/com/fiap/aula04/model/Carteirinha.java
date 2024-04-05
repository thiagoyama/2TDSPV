package br.com.fiap.aula04.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name="TB_CARTEIRINHA")
public class Carteirinha {

    @Id
    @GeneratedValue
    @Column(name="cd_cateirinha")
    private Long codigo;

    @Column(name="dt_emissao", nullable = false)
    private LocalDate dataEmissao;

    @Column(name="dt_vencimento")
    private LocalDate dataVencimento;

    @Column(name="st_ativo",nullable = false)
    private Boolean ativo;

    //Relacionamento 1:1
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="nr_rm", nullable = false)
    private Aluno aluno;
}
