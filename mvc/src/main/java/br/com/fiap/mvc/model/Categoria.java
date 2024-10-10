package br.com.fiap.mvc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TB_TDSPV_CATEGORIA")
@Getter @Setter
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank @Size(max = 50)
    @Column(name = "nm_categoria", nullable = false, length = 50)
    private String nome;

}
