package br.com.fiap.tour.repository;

import br.com.fiap.tour.domain.Pacote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacoteRepository extends JpaRepository<Pacote, Long> {

    //Pesquisa pacote por um intervalo de valores
    @Query("from Pacote p where p.valor > :minimo and p.valor < :maximo")
    Page<Pacote> buscarPorPreco(Double minimo, Double maximo, Pageable pageable);

    //Obter todos os pacotes de um determinado destino (id do destino).
    @Query("from Pacote p where p.destino.id = :id")
    Page<Pacote> buscarPorDestino(Long id, Pageable pageable);


}
