package br.com.fiap.mvc.model;

public enum StatusProduto {

    DISPONIVEL("Disponível"),
    INDISPONIVEL("Indisponível"),
    FORA_DE_LINHA("Fora de linha");

    StatusProduto(String label){
        this.label = label;
    }

    private final String label;

    public String getLabel(){
        return label;
    }

}
