package br.edu.infnet.tp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.tp1.model.CrudSimples;
import br.edu.infnet.tp1.repository.CrudRepository;

@RestController
public class CrudController {
	
	@Autowired
	private CrudRepository crudRepository;
	
	@RequestMapping(value = "/crud/all", method = RequestMethod.GET)
	public List<CrudSimples> findAll(){
		return crudRepository.findAll();
	}
	
	@RequestMapping(value = "/crud/salvar", method = RequestMethod.GET)
	public CrudSimples save(@RequestParam("nome") String nome) {
		CrudSimples crudSimples = crudRepository.save(nome);
		return crudSimples;
	}
	
	@RequestMapping(value = "/crud/atualizar", method = RequestMethod.GET)
	public CrudSimples update(@RequestParam("id") Integer id, @RequestParam("nome") String nome) {
		CrudSimples crudSimples = crudRepository.update(id, nome);
		return crudSimples;
	}
	
	@RequestMapping(value = "/crud/deletar", method = RequestMethod.GET)
	public String delete(@RequestParam("id") Integer id) {
		crudRepository.delete(id);
		return "ID " + id + " deletado com sucesso!";
	}
}
