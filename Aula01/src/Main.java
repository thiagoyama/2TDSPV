import br.com.fiap.revisao.model.Produto;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Produto com dados
        Produto produto = new Produto(1l, 100.0, "Garrafa");
        //Chamar o método de calcular desconto
        double novoValor = produto.calcularDesconto(50);
        //Exibir o valor com desconto
        System.out.println("Preço com desconto " + novoValor);

        //Instanciar um Calcado
        //Chamar o método de calcular desconto
        //Exibir o valor com desconto

    }
}