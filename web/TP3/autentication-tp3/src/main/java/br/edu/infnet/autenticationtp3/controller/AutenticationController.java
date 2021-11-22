package br.edu.infnet.autenticationtp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import br.edu.infnet.autenticationtp3.model.service.CadastroService;

@Controller
public class AutenticationController {
	
	@Autowired
	private CadastroService cadastroService;
	
	@PostMapping(value = "/autenticacao")
	public String telaHome(Model model, @RequestParam String email, @RequestParam String senha) {
		
		if (cadastroService.autenticacao(email, senha) != null) {
			return "home";
		} else {
			model.addAttribute("mensagem", email + ", não conseguiu realizar a autenticação. Tente novamente!");
			return "logar/login";
		}
	}
}
