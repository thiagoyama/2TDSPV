package br.com.fiap.mvc.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_TDSPV_CLIENTE")
@Getter @Setter
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank @Size(max = 50)
    @Column(name="nm_cliente", nullable = false, length = 50)
    private String nome;

    @Size(max = 11)
    @Column(name="nr_cpf", length = 11)
    private String cpf;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cd_endereco")
    private Endereco endereco;

}
