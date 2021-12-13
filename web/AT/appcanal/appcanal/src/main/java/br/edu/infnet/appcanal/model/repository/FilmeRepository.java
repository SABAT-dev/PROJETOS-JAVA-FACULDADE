package br.edu.infnet.appcanal.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcanal.model.domain.Filme;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Integer> {

	@Query("from Filme f where f.usuario.id =:id")
	public List<Filme> findAll(Integer id, Sort by);
	
}
