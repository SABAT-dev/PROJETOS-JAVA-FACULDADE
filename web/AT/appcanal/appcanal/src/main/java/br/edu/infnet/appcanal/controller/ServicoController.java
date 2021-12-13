package br.edu.infnet.appcanal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.ServicoService;

@Controller
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping(value = "/servicos")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {			
		model.addAttribute("listaServicos", servicoService.obterLista(usuario));		
		return "servico/listaServico";
	}
	
	@GetMapping(value = "/servico/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		try {
			servicoService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("mensagem", "Impossível realizar a exclusão deste serviço!!!");
		}
		
		return this.telaLista(model, usuario);
	}
}
