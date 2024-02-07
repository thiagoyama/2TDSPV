package br.com.fiap.revisao.model;

public class Produto {

    private  Long id;
    private String nome;
    private Double preco;

    //new Produto();
    public Produto(){
        super();
    }

    //new Produto(10, 100.0, "Churros");
    public Produto(Long id, Double preco, String nome){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

}
