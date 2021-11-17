package br.edu.infnet.appcanal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcanal.domain.Aluno;

@Controller
public class AlunoController {
	
	@GetMapping(value = "/aluno")
	public String telaCadastro() {
		return "aluno/cadastroAluno";
		
	}
	@PostMapping(value = "/aluno/incluir")
	public String telaConfirmacao(Aluno aluno) {
		
		System.out.println("O aluno " + aluno.getNome() + " foi cadastrado com sucesso!!!");
		
		return "aluno/cadastroAluno";
	}
}
