package br.edu.infnet.appcanal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcanal.model.domain.Serie;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.repository.SerieRepository;

@Service
public class SerieService {

	@Autowired
	private SerieRepository serieRepository;
	
	public void incluir(Serie serie) {
		serieRepository.save(serie);
	}
	
	public void excluir(Integer id) {
		serieRepository.deleteById(id);
	}
	
	public Serie obterPorId(Integer id) {
		return serieRepository.findById(id).orElse(null);
	}
	
	public List<Serie> obterLista(Usuario usuario){
		return (List<Serie>) serieRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "genero"));
	}
	
	public Integer obterQtde() {
		return (int) serieRepository.count();
	}
	
}
