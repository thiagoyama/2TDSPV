package br.com.fiap.mvc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_TDSPV_CLIENTE")
@Getter @Setter
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="nm_cliente", nullable = false, length = 50)
    private String nome;

    @Column(name="nr_cpf", length = 11)
    private String cpf;

    @OneToOne
    @JoinColumn(name="cd_endereco")
    private Endereco endereco;

}
