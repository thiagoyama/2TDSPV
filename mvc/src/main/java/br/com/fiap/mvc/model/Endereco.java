package br.com.fiap.mvc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TB_TDSPV_ENDERECO")
@Getter @Setter
public class Endereco {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="ds_logradouro", nullable = false, length = 50)
    private String logradouro;

    @Column(name="nr_endereco", nullable = false, length = 10)
    private String numero;

    @Column(name="nr_cep", length = 12, nullable = false)
    private String cep;
}
