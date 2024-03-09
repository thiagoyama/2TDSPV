package br.com.fiap.aula03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataCadastro;

}
