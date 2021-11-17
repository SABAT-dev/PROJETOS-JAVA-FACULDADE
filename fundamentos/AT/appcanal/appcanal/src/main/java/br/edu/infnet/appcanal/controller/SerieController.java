package br.edu.infnet.appcanal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcanal.domain.Serie;

@Controller
public class SerieController {

	@GetMapping(value = "/serie")
	public String telaCadastro(){
		return "serie/cadastroSerie";
	}
	
	@PostMapping(value = "/serie/incluir")
	public String telaConfirmacao(Serie serie) {
		
		System.out.println("O gênero " + serie.getGenero() + " foi cadastrado com sucesso!!!");
		
		return "serie/cadastroSerie";
	}
}
