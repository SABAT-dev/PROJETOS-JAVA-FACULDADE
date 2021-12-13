package br.edu.infnet.appcanal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcanal.model.domain.Servico;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.repository.ServicoRepository;


@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;
	
	public void excluir(Integer id) {
		servicoRepository.deleteById(id);
	}
	
	public Servico obterPorId(Integer id) {
		return servicoRepository.findById(id).orElse(null);
	}
	
	public List<Servico> obterLista(Usuario usuario) {			
		return (List<Servico>) servicoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "canal"));
	}
	
	public Integer obterQtde() {
		return (int) servicoRepository.count();
	}
	
}
