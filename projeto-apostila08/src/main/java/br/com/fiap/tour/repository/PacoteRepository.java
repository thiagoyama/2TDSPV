package br.com.fiap.tour.repository;

import br.com.fiap.tour.domain.Pacote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PacoteRepository extends JpaRepository<Pacote, Long> {

    //Pesquisar pacotes por preço menor
    Page<Pacote> findByValorLessThan(Float valor, Pageable pageable);

    //Pesquisa o pacote pelo intervalo de data de saida
    @Query("from Pacote p where p.dataSaida between :inicio and :fim")
    Page<Pacote> buscarPorDatas(LocalDate inicio, LocalDate fim, Pageable pageable);

    //Pesquisa pacote por um intervalo de valores
    @Query("from Pacote p where p.valor > :minimo and p.valor < :maximo")
    Page<Pacote> buscarPorPreco(Double minimo, Double maximo, Pageable pageable);

    //Obter todos os pacotes de um determinado destino (id do destino).
    @Query("from Pacote p where p.destino.id = :id")
    Page<Pacote> buscarPorDestino(Long id, Pageable pageable);


}
