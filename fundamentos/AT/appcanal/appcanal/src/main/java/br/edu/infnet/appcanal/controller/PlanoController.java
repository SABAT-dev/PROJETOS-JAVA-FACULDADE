package br.edu.infnet.appcanal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcanal.domain.Plano;

@Controller
public class PlanoController {
	
	@GetMapping(value = "/plano")
	public String telaCadastro(){
		return "plano/cadastroPlano";
	}
	
	@PostMapping(value = "/plano/incluir")
	public String telaConfirmacao(Plano plano) {
		
		System.out.println("A duração do plano " + plano.getDuracaoPlano() + " foi cadastrada com sucesso!!!");
		
		return "plano/cadastroPlano";
	}
}
