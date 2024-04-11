package br.com.fiap.aula04.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList<>();

    @ManyToMany(mappedBy = "turmas")
    private List<Professor> professores;

    //Método para o cadastro da turma e alunos em cascata
    //Seta a FK na tabela aluno
    public void addAluno(Aluno aluno){
        aluno.setTurma(this); //Seta a FK no banco
        alunos.add(aluno); //Adiciona o aluno na lista de alunos
    }

}
