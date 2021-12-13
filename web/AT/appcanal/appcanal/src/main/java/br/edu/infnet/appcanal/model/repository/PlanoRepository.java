package br.edu.infnet.appcanal.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcanal.model.domain.Plano;

@Repository
public interface PlanoRepository extends CrudRepository<Plano, Integer> {

	@Query("from Plano p where p.usuario.id = :id")
	public List<Plano> findAll(Integer id, Sort by);
	
}
