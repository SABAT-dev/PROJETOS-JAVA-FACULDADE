package br.edu.infnet.tp1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import br.edu.infnet.tp1.model.CrudSimples;

@Component
public class CrudRepository {
	
	private static List<CrudSimples> crudLista = new ArrayList<>();
	
	//SALVEI
	public CrudSimples save(String nome) {
		
		Integer id = geradorId();
		while (findById(id) != null) {
			id = geradorId();
		}
		
		CrudSimples crud = new CrudSimples();
		
		crud.setId(id);
		crud.setNome(nome);
		crudLista.add(crud);
		return crud;
	}
	
	//GERAR OS ID's
	private Integer geradorId() {
		Random ran = new Random();
		return ran.nextInt(100);
	}
	
	//ENCONTREI PELO ID
	public CrudSimples findById(Integer id) {
		for (CrudSimples crudSimples : crudLista) {
			if(crudSimples.getId().equals(id)) {
				return crudSimples;
			}
		}
		
		return null;
	}
	
	//ATUALIZEI
	public CrudSimples update(Integer id, String nome) {
		
		CrudSimples crudSimples = findById(id);
		
		if(crudSimples != null) {
			crudSimples.setNome(nome);
		}
		
		return crudSimples;
	}
	
	//ENCONTREI TUDO
	public List<CrudSimples> findAll() {
		return crudLista;
	}
	
	//DELETEI
	public void delete(Integer id) {
		
		CrudSimples crud = findById(id);
		
		if(crud != null) {
			crudLista.remove(crud);
		}
	}
}
