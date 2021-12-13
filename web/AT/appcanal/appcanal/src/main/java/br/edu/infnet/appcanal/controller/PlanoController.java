package br.edu.infnet.appcanal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcanal.model.domain.Plano;
import br.edu.infnet.appcanal.model.domain.Servico;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.ClienteService;
import br.edu.infnet.appcanal.model.service.PlanoService;
import br.edu.infnet.appcanal.model.service.ServicoService;

@Controller
public class PlanoController {
	
	@Autowired
	private PlanoService planoService;
	@Autowired
	private ServicoService servicoService;
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/plano")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario){
		model.addAttribute("servicos", servicoService.obterLista(usuario));
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		return "plano/cadastroPlano";
	}
	
	@GetMapping(value = "/planos")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {			
		model.addAttribute("listaPlanos", planoService.obterLista(usuario));		
		return "plano/listaPlano";
	}
	
	@PostMapping(value = "/plano/incluir")
	public String incluir(Model model, Plano plano, @RequestParam String[] servicoIds, @SessionAttribute("user") Usuario usuario) {
		
		List<Servico> listaServico = new ArrayList<Servico>();
		plano.setUsuario(usuario);
		
		for (String idServico : servicoIds) {
			Servico servico = servicoService.obterPorId(Integer.valueOf(idServico));
			listaServico.add(servico);
		}
		
		plano.setServicos(listaServico);
		planoService.incluir(plano);
		model.addAttribute("duracaoPlano", plano.getDuracaoPlano());		
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/plano/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		try {
			planoService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("mensagem", "Impossível realizar a exclusão deste plano!!!");
		}
		
		return this.telaLista(model, usuario);
	}
	
}
