package br.com.fiap.aula03;

import br.com.fiap.aula03.model.CategoriaInvestimento;
import br.com.fiap.aula03.model.Investimento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula03Application {

	public static void main(String[] args) {

		SpringApplication.run(Aula03Application.class, args);

		//Instanciar um Investimento
		Investimento inv = new Investimento("Selic",
				CategoriaInvestimento.TESOURO_DIRETO, 100.0);

		//Setar o valor do investimento
		inv.setValor(1000.0);

		//Exibir o valor do investimento
		System.out.println(inv.getValor());

	}

}
