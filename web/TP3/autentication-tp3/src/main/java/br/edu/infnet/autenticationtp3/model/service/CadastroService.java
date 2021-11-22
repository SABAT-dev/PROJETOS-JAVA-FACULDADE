package br.edu.infnet.autenticationtp3.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.autenticationtp3.model.domain.Cadastro;
import br.edu.infnet.autenticationtp3.model.repository.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository cadastroRepository;
		
	public List<Cadastro> obterLista(){
		return (List<Cadastro>) cadastroRepository.findAll();
	}
	
	public void incluir(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
	
	}
	
	public Cadastro autenticacao(String email, String senha) {
		return cadastroRepository.autenticacao(email, senha);
	}
	
}
