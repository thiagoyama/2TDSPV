package br.com.fiap.revisao.view;

import java.util.*;

public class ColecoesTeste {

    public static void main(String[] args) {
        //Criar uma lista de (String) carros
        List<String> listaCarros = new ArrayList<>();

        //Adicionar 3 carros na lista
        listaCarros.add("Gol");
        listaCarros.add("Astra");
        listaCarros.add("Uno");
        listaCarros.add("Uno");

        //recuperar um elemento da lista
        System.out.println(listaCarros.get(0));

        System.out.println("FOR NORMAL:");
        //Exibir os carros armazenados na lista
        for (int i=0; i < listaCarros.size(); i++){
            System.out.println(listaCarros.get(i));
        }

        System.out.println("FOREACH:");
        for (String churros : listaCarros){
            System.out.println(churros);
        }

        //Criar um set de (String) cores
        Set<String> cores = new HashSet<>();

        //Adicionar duas cores
        cores.add("Verde");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Preto");

        //Exibir as cores do conjunto (set)
        for (String item : cores){
            System.out.println(item);
        }

        //Criar um Map de estados brasileiros: chave (sigla do estado), valor (nome do estado)
        Map<String,String> brasil = new HashMap<>();
        //Adicionar 3 estados brasileiros
        brasil.put("SP", "São Paulo");
        brasil.put("SC", "Santa Catarina");
        brasil.put("MT", "Mato Grosso");
        //Exibir o nome do estado da chave MT
        System.out.println(brasil.get("MT"));
        //Exibir a sigla e o nome de todos os estados armazenados no map
        Set<String> chaves = brasil.keySet(); //retorna as chaves do mapa
        for (String chave : chaves){
            System.out.println(chave + " - " + brasil.get(chave));
        }

    }
}
