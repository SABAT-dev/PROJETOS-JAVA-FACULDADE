package br.edu.infnet.nuvemtp3.repository;

import br.edu.infnet.nuvemtp3.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {
}
