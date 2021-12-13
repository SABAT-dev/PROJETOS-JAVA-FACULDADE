package br.edu.infnet.appcanal.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcanal.model.domain.Esporte;

@Repository
public interface EsporteRepository extends CrudRepository<Esporte, Integer> {

	@Query("from Esporte e where e.usuario.id =:id")
	public List<Esporte> findAll(Integer id, Sort by);
	
}
