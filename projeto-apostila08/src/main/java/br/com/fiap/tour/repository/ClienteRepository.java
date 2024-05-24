package br.com.fiap.tour.repository;

import br.com.fiap.tour.domain.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("from Cliente c where c.endereco.cidade.uf in :estados")
    public Page<Cliente> buscarPorEstados(List<String> estados, Pageable pageable);

    //Buscar por parte do nome e parte do nome da cidade
    @Query("from Cliente c where c.nome like %:nome% and c.endereco.cidade.nome like %:cidade%")
    public Page<Cliente> buscarPorNomeECidade(String nome, String cidade, Pageable pageable);

    //Obter todos os cliente que possuem reserva com um pacote com valor maior
    @Query("select r.cliente from Reserva r where r.pacote.valor > :valor")
    Page<Cliente> buscarPorValorPacote(Double valor, Pageable pageable);

    //Obter todos os clientes por parte do nome.
    @Query("from Cliente c where lower(c.nome) like lower(%:nome%)")
    Page<Cliente> buscarPorNome(String nome, Pageable pageable);

    //Obter todos os clientes de um estado
    @Query("from Cliente c where c.endereco.cidade.uf = :estado")
    Page<Cliente> buscarPorEstado(String estado, Pageable pageable);

}
