package br.edu.infnet.appcanal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcanal.domain.Cliente;

@Controller
public class ClienteController {
	
	@GetMapping(value = "/cliente") //INDEX
	public String telaCadastro() {
		return "cliente/cadastroCliente"; //TELA
	}
	
	
	@PostMapping(value = "/cliente/incluir") //CADASTRO
	public String telaConfirmacao(Cliente cliente) {
		
		System.out.println("O cliente " + cliente.getNome() + " foi cadastrado com sucesso!!!");
		
		return "cliente/cadastroCliente"; //TELA
	}
}
