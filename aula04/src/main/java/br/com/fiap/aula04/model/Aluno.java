package br.com.fiap.aula04.model;

import br.com.fiap.aula04.dto.aluno.CadastroAlunoDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor

@Entity
@Table(name="tb_aluno")
@EntityListeners(AuditingEntityListener.class)
public class Aluno {

    @Id
    @GeneratedValue
    @Column(name="nr_rm")
    private Long rm;

    @Column(name="nm_aluno", length = 100, nullable = false)
    private String nome;

    @Column(name="nr_cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name="dt_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @CreatedDate
    @Column(name="dt_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @Column(name="ds_nivel_escolaridade", nullable = false, length = 30)
    @Enumerated(EnumType.STRING) //Grava o texto da constante no banco
    private NivelEscolaridade nivelEscolaridade;

    @Column(name="vl_renda", precision = 7)
    private Double renda; //BigDecimal

    @Transient //Não será uma coluna no banco
    private Integer idade;

    public Aluno(CadastroAlunoDto alunoDto) {
        nome = alunoDto.nome();
        cpf = alunoDto.cpf();
        dataNascimento = alunoDto.dataNascimento();
        nivelEscolaridade = alunoDto.nivelEscolaridade();
        renda = alunoDto.renda();
    }
}
