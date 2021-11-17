package br.edu.infnet.appcanal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcanal.domain.Filme;

@Controller
public class FilmeController {

	@GetMapping(value = "/filme")
	public String telaCadastro(){
		return "filme/cadastroFilme";
	}
	
	@PostMapping(value = "/filme/incluir")
	public String telaConfirmacao(Filme filme) {
		
		System.out.println("A categoria " + filme.getCategoria() + " foi cadastrada com sucesso!!!");
		
		return "filme/cadastroFilme";
	}
}
