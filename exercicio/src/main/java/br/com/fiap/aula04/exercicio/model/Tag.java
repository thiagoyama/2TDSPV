package br.com.fiap.aula04.exercicio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="TB_TAG")
public class Tag {

    @Id
    @GeneratedValue
    @Column(name="cd_tag")
    private Long id;

    @Column(name="nm_tag", nullable = false, length = 20)
    private String nome;

    @ManyToMany
    @JoinTable(name="TB_TAG_POST",
        joinColumns = @JoinColumn(name="cd_tag"),
        inverseJoinColumns = @JoinColumn(name="cd_post"))
    private List<Post> posts;

}
