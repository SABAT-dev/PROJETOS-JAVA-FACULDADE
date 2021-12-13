package br.edu.infnet.appcanal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcanal.model.domain.Plano;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.repository.PlanoRepository;

@Service
public class PlanoService {

	@Autowired
	private PlanoRepository planoRepository;
	
	public List<Plano> obterLista(){
		
		return (List<Plano>) planoRepository.findAll();
	}
	
	public List<Plano> obterLista(Usuario usuario){
		
		return (List<Plano>) planoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "duracaoPlano"));
	}

	public void incluir(Plano plano){

		planoRepository.save(plano);
	}
	
	public void excluir(Integer id) {
		planoRepository.deleteById(id);
	}
	
	public Integer obterQtde() {
		return (int) planoRepository.count();
	}
	
}
