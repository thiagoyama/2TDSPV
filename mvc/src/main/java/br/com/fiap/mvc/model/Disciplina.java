package br.com.fiap.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Disciplina {

    private Double media;
    private Double cp;
    private Double challenge;
    private Double gs;

    public Double calcularMediaFinal() {
        return media * 0.4 + (cp * 0.2 + gs * 0.6 + challenge *0.2 )*0.6;
    }
}
