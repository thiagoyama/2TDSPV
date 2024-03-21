package br.com.fiap.aula04.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Aluno {

    @Id
    private Long rm;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private NivelEscolaridade nivelEscolaridade;

}
