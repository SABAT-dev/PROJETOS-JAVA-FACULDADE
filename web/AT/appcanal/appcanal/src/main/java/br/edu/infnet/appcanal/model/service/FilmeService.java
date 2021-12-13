package br.edu.infnet.appcanal.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcanal.model.domain.Filme;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.repository.FilmeRepository;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	public void incluir(Filme filme) {
		filmeRepository.save(filme);
	}
	
	public void excluir(Integer id) {
		filmeRepository.deleteById(id);
	}
	
	public Filme obterPorId(Integer id) {
		return filmeRepository.findById(id).orElse(null);
	}
	
	public List<Filme> obterLista(Usuario usuario){
		return (List<Filme>) filmeRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "categoria"));
	}
	
	public Integer obterQtde() {
		return (int) filmeRepository.count();
	}
}
