package br.com.fiap.revisao.model;

public class Produto {

    private Long id;
    private String nome;
    private Double preco;

    //new Produto();
    public Produto() {
    }

    //new Produto(10, 100.0, "Churros");
    public Produto(Long id, Double preco, String nome) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    //Calcula o preço final com desconto em %, 10% 20%...
    public double calcularDesconto(double porcentagem) {
        return preco - preco * porcentagem / 100;
    }

    //Sobrecarga de método: método com o mesmo nome mas parâmetros diferentes.
    //Calcular o preço final com o desconto com cupom "FIAP20" fornece 20% de desconto
    public double calcularDesconto(String cupom) {
        if (cupom.equals("FIAP20")) {
            return preco * 0.8; //calcularDesconto(20);
        }
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
