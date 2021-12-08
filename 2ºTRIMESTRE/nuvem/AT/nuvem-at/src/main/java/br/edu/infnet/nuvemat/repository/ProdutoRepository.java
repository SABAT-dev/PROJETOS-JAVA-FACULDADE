package br.edu.infnet.nuvemat.repository;

import br.edu.infnet.nuvemat.model.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    @Query("from Produto pdt where pdt.id= :id")
    public Optional<Produto> findById(Integer id);
}
