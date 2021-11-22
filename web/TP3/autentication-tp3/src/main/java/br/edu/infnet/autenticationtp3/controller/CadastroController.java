package br.edu.infnet.autenticationtp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.autenticationtp3.model.domain.Cadastro;
import br.edu.infnet.autenticationtp3.model.service.CadastroService;

@Controller
public class CadastroController {
	
	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping("/")
	public String telaHome() {
		return "home";
	}
	
	@PostMapping(value = "/cadastro")
	public String telaConfirmacao(Model model, Cadastro cadastro) {
		
		cadastroService.incluir(cadastro);
		
		model.addAttribute("nome", cadastro.getNome());
		model.addAttribute("cadastroLista", cadastroService.obterLista());
		
		return "confirmation";
	}
	
	@GetMapping(value = "/cadastro")
	public String telaLogin(Cadastro cadastro) {
		return "logar/login";
	}
	
}
