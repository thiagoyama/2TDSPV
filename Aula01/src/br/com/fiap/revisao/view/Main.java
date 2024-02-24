package br.com.fiap.revisao.view;

import br.com.fiap.revisao.model.Calcado;
import br.com.fiap.revisao.model.Produto;
import br.com.fiap.revisao.model.TipoCalcado;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Produto com dados
        Produto produto = new Produto(1L, 180.0, "Garrafa");
        //Chamar o método de calcular desconto
        double novoValor = produto.calcularDesconto("FIAP20");
        //Exibir o valor com desconto
        System.out.println("Preço com desconto " + novoValor);

        //Instanciar um Calcado
        Calcado tenis = new Calcado(2L, 100.0, "Tenis branco", 40f);
        //Chamar o método de calcular desconto
        novoValor = tenis.calcularDesconto("CALCADO40");
        //Exibir o valor com desconto
        System.out.println("Calçado com desconto: " + novoValor);

        //Atribuir um valor para o tipo do calcado
        tenis.setTipo(TipoCalcado.TENIS);

        //Validar se o calcado é do tipo TENIS
        if (tenis.getTipo() == TipoCalcado.TENIS)
            System.out.println("É um tenis");
        else
            System.out.println("Não é um tenis");

        //Operador ternário
        //condicao ? se verdadeiro : se falso;
        //Se o valor do produto for maior do que 100, dizer que está caro, se não dizer que está barato
        if (produto.getPreco() > 100)
            System.out.println("O produto está caro");
        else
            System.out.println("O produto está barato");

        System.out.println(produto.getPreco() > 100 ? "O produto está caro" : "O produto está barato");
    }
}