package br.edu.infnet.appcanal.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcanal.model.domain.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer> {

	@Query("from Servico sv where sv.usuario.id =:id")
	public List<Servico> findAll(Integer id, Sort by);
	
}
