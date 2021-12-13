package br.edu.infnet.appcanal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcanal.model.domain.Cliente;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
		
	public List<Cliente> obterLista(){
		
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public List<Cliente> obterLista(Usuario usuario){
		
		return (List<Cliente>) clienteRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void incluir(Cliente cliente){

		clienteRepository.save(cliente);
	}
	
	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}

	public Integer obterQtde() {
		return (int) clienteRepository.count();
	}
	
}
