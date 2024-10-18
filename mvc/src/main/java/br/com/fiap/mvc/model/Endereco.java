package br.com.fiap.mvc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TB_TDSPV_ENDERECO")
@Getter @Setter
public class Endereco {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank @Size(max = 50)
    @Column(name="ds_logradouro", nullable = false, length = 50)
    private String logradouro;

    @NotBlank @Size(max = 10)
    @Column(name="nr_endereco", nullable = false, length = 10)
    private String numero;

    @NotBlank @Size(max = 12)
    @Column(name="nr_cep", length = 12, nullable = false)
    private String cep;
}
