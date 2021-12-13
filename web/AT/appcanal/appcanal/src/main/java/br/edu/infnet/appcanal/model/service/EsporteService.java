package br.edu.infnet.appcanal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcanal.model.domain.Esporte;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.repository.EsporteRepository;

@Service
public class EsporteService {

	@Autowired
	private EsporteRepository esporteRepository;
	
	public void incluir(Esporte esporte) {
		esporteRepository.save(esporte);
	}
	
	public void excluir(Integer id) {
		esporteRepository.deleteById(id);
	}
	
	public Esporte obterPorId(Integer id) {
		return esporteRepository.findById(id).orElse(null);
	}
	
	public List<Esporte> obterLista(Usuario usuario){
		return (List<Esporte>) esporteRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "time"));
	}
	
	public Integer obterQtde() {
		return (int) esporteRepository.count();
	}
	
}
