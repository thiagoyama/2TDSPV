package br.com.fiap.revisao.model;

public class Calcado extends Produto {

    private Float tamanho;

    public Calcado() {}

    public Calcado(Long id, Double preco, String nome,
                                        Float tamanho) {
        super(id, preco, nome);
        this.tamanho = tamanho;
    }

    //Sobrescrita de método (Override) com o cupom "CALCADO40" que dá 40% de desconto
    //Além do outro cupom "FIAP20"
    @Override
    public double calcularDesconto(String cupom){
        if (cupom.equals("CALCADO40")){
            return getPreco() * 0.6;
        }
        //Chama o método de calcular desconto do pai
        return super.calcularDesconto(cupom);
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }
}
