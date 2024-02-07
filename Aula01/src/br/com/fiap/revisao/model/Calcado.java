package br.com.fiap.revisao.model;

public class Calcado extends Produto {

    private Float tamanho;

    public Calcado() {}

    public Calcado(Long id, Double preco, String nome,
                                        Float tamanho) {
        super(id, preco, nome);
        this.tamanho = tamanho;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }
}
