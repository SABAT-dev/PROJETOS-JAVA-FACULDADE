package br.edu.infnet.appcanal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcanal.domain.Servico;

@Controller
public class ServicoController {
	
	@GetMapping(value = "/servico")
	public String telaCadastro(){
		return "servico/cadastroServico";
	}
	
	@PostMapping(value = "/servico/incluir")
	public String telaConfirmacao(Servico servico) {
		
		System.out.println("O canal " + servico.getCanal() + " foi cadastrado com sucesso!!!");
		
		return "servico/cadastroServico";
	}
}
