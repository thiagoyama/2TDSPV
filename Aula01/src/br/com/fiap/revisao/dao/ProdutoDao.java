package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.model.Produto;
import java.util.List;

//Contrato, padronização para diminuir o acoplamento entre os objetos
public interface ProdutoDao {

    List<Produto> buscar();
    Produto cadastrar(Produto produto);

}
