package br.com.fiap.revisao.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        //Adicionar 3 estados brasileiros
        //Exibir a sigla e o nome de todos os estados armazenados no map

    }
}
