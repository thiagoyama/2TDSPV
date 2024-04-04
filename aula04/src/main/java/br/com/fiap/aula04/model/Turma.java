package br.com.fiap.aula04.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor

@Entity
@Table(name="TB_TURMA")
public class Turma {

    @Id
    @GeneratedValue
    @Column(name="cd_turma")
    private Long codigo;

    @Column(name="nm_turma", length = 30, nullable = false)
    private String nome;

    @Column(name="qt_aula")
    private Integer quantidadeAula;

    @Enumerated(EnumType.STRING)
    @Column(name="ds_periodo", nullable = false, length = 20)
    private Periodo periodo;

}
