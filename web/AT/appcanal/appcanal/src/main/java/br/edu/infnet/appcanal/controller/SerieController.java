package br.edu.infnet.appcanal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcanal.model.domain.Serie;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.SerieService;

@Controller
public class SerieController {

	@Autowired
	private SerieService serieService;
	
	@GetMapping(value = "/serie")
	public String telaCadastro(){
		return "serie/cadastroSerie";
	}
	
	@GetMapping(value = "/series")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {			
		model.addAttribute("listaSeries", serieService.obterLista(usuario));		
		return "serie/listaSerie";
	}
	
	@PostMapping(value = "/serie/incluir")
	public String incluir(Model model, Serie serie, @SessionAttribute("user") Usuario usuario) {
		serie.setUsuario(usuario);
		serieService.incluir(serie);
		model.addAttribute("genero", serie.getGenero());
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/serie/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		try {
			serieService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("mensagem", "Impossível realizar a exclusão deste série!!!");
		}
		
		return this.telaLista(model, usuario);
	}
}
