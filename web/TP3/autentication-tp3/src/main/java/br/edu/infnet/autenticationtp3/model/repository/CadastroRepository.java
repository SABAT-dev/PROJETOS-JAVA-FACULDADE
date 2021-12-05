package br.edu.infnet.autenticationtp3.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.autenticationtp3.model.domain.Cadastro;

@Repository
public interface CadastroRepository extends CrudRepository<Cadastro, Integer> {
	
	@Query("from Cadastro cad where cad.email =:email and cad.senha =:senha")
	public Cadastro autenticacao(String email, String senha);
}
