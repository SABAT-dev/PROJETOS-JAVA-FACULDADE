package br.edu.infnet.appcanal.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcanal.model.domain.Serie;

@Repository
public interface SerieRepository extends CrudRepository<Serie, Integer> {

	@Query("from Serie s where s.usuario.id =:id")
	public List<Serie> findAll(Integer id, Sort by);	
	
}
