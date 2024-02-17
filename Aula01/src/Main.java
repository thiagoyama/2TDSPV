import br.com.fiap.revisao.model.Calcado;
import br.com.fiap.revisao.model.Produto;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Produto com dados
        Produto produto = new Produto(1L, 100.0, "Garrafa");
        //Chamar o método de calcular desconto
        double novoValor = produto.calcularDesconto("FIAP20");
        //Exibir o valor com desconto
        System.out.println("Preço com desconto " + novoValor);

        //Instanciar um Calcado
        Calcado tenis = new Calcado(2L, 150.0, "Tenis branco", 40f);
        //Chamar o método de calcular desconto
        novoValor = tenis.calcularDesconto(10);
        //Exibir o valor com desconto
        System.out.println("Calçado com desconto: " + novoValor);
    }
}