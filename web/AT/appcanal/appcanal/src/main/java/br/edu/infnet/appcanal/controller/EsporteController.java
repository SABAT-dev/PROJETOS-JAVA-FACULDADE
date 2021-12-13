package br.edu.infnet.appcanal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcanal.model.domain.Esporte;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.EsporteService;

@Controller
public class EsporteController {
	
	@Autowired
	private EsporteService esporteService;
	
	@GetMapping(value = "/esporte")
	public String telaCadastro(){
		return "esporte/cadastroEsporte";
	}
	
	@GetMapping(value = "/esportes")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {			
		model.addAttribute("listaEsportes", esporteService.obterLista(usuario));		
		return "esporte/listaEsporte";
	}
	
	@PostMapping(value = "/esporte/incluir")
	public String incluir(Model model, Esporte esporte, @SessionAttribute("user") Usuario usuario) {
		esporte.setUsuario(usuario);
		esporteService.incluir(esporte);
		model.addAttribute("time", esporte.getTime());
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/esporte/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		try {
			esporteService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("mensagem", "Impossível realizar a exclusão deste esporte!!!");
		}
		
		return this.telaLista(model, usuario);
	}
}
