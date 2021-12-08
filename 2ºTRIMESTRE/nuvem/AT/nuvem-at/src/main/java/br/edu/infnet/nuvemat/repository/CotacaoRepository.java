package br.edu.infnet.nuvemat.repository;

import br.edu.infnet.nuvemat.model.Cotacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotacaoRepository extends CrudRepository<Cotacao, Integer> {

}
