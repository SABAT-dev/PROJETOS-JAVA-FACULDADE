package br.edu.infnet.appcanal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcanal.domain.Esporte;

@Controller
public class EsporteController {
	
	@GetMapping(value = "/esporte")
	public String telaCadastro(){
		return "esporte/cadastroEsporte";
	}
	
	@PostMapping(value = "/esporte/incluir")
	public String telaConfirmacao(Esporte esporte) {
		
		System.out.println("O time " + esporte.getTime() + " foi cadastrado com sucesso!!!");
		
		return "esporte/cadastroEsporte";
	}	
}
