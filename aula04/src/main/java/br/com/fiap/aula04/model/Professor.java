package br.com.fiap.aula04.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor

@Entity
@Table(name="TB_PROFESSOR")
public class Professor {

    @Id
    @GeneratedValue
    @Column(name="cd_professor")
    private Long codigo;

    @Column(name="nm_professor", nullable = false, length = 100)
    private String nome;

    @Column(name="dt_contratacao", nullable = false)
    private LocalDate dataContratacao;

    @Column(name = "vl_salario", precision = 9, scale = 2)
    private BigDecimal salario;

}
