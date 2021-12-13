package br.edu.infnet.appcanal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcanal.model.domain.Filme;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.FilmeService;

@Controller
public class FilmeController {

	@Autowired
	private FilmeService filmeService;
	
	@GetMapping(value = "/filme")
	public String telaCadastro(){
		return "filme/cadastroFilme";
	}
	
	@GetMapping(value = "/filmes")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {			
		model.addAttribute("listaFilmes", filmeService.obterLista(usuario));		
		return "filme/listaFilme";
	}
	
	@PostMapping(value = "/filme/incluir")
	public String incluir(Model model, Filme filme, @SessionAttribute("user") Usuario usuario) {
		filme.setUsuario(usuario);
		filmeService.incluir(filme);
		model.addAttribute("categoria", filme.getCategoria());
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/filme/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		try {
			filmeService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("mensagem", "Impossível realizar a exclusão deste filme!!!");
		}
		return this.telaLista(model, usuario);
	}
}
