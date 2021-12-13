package br.edu.infnet.appcanal.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.ClienteService;
import br.edu.infnet.appcanal.model.service.EsporteService;
import br.edu.infnet.appcanal.model.service.FilmeService;
import br.edu.infnet.appcanal.model.service.PlanoService;
import br.edu.infnet.appcanal.model.service.SerieService;
import br.edu.infnet.appcanal.model.service.ServicoService;
import br.edu.infnet.appcanal.model.service.UsuarioService;

@Controller
@SessionAttributes("user")
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private FilmeService filmeService;
	@Autowired
	private SerieService serieService;
	@Autowired
	private EsporteService esporteService;
	@Autowired
	private PlanoService planoService;
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String telaLogin(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.autenticacao(email, senha);
		
		if(usuario != null) {
			model.addAttribute("user", usuario);
			
			return "index";
		} else {
			model.addAttribute("mensagem", email + ", não conseguiu realizar a autenticação. Tente novamente!");			
			return "login";			
		}
	}
	
	@GetMapping(value = "/app")
	public String telaApp(Model model) {
		Map<String, Integer> mapaApp = new LinkedHashMap<String, Integer>();
		mapaApp.put("Usuários", usuarioService.obterQtde());
		mapaApp.put("Clientes", clienteService.obterQtde());
		mapaApp.put("Filmes", filmeService.obterQtde());
		mapaApp.put("Séries", serieService.obterQtde());
		mapaApp.put("Esportes", esporteService.obterQtde());
		mapaApp.put("Planos", planoService.obterQtde());
		mapaApp.put("Serviços", servicoService.obterQtde());
		
		model.addAttribute("mapa", mapaApp);
		return "app";
	}
	
	@GetMapping(value = "/home")
	public String telaHome() {
		return "home";
	}
	
	@GetMapping(value = "/logout")
	public String telaSair(HttpSession session, SessionStatus status) {
		status.setComplete();		
		session.removeAttribute("user");		
		return "redirect:/";
	}
	
}
