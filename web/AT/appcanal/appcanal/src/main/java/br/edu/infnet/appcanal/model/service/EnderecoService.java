package br.edu.infnet.appcanal.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcanal.clientes.IEnderecoClient;
import br.edu.infnet.appcanal.model.domain.Endereco;


@Service
public class EnderecoService {

	@Autowired
	private IEnderecoClient enderecoClient;

	public Endereco obterEnderecoPorCep(String cep) {
		
		return enderecoClient.buscarCep(cep);
	}
	
}
