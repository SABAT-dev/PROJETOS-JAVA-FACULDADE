package br.edu.infnet.venturaweb.app.usuarios;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.infnet.venturaweb.domain.usuarios.Usuario;
import br.edu.infnet.venturaweb.infra.usuarios.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	//ABRE DIRETO AO INICIAR A INDEX
	@GetMapping(value = "/")
	public String telaIndex( ) {
		return "index";
	}
	
	//HREFS - INDO PARA CADASTROS
	@GetMapping(value = "/candidato")
	public String telaCadastroCandidato(Usuario usuario) {
		return "candidato/cadastroCandidato";
	}
	@GetMapping(value = "/empresa")
	public String telaCadastroEmpresa(Usuario usuario) {
		return "empresa/cadastroEmpresa";
	}
	
	//VOLTANDO PARA INDEX APÓS CADASTRO
	@PostMapping(value = "/cadastro")
	public ModelAndView cadastrarConta(@Valid Usuario usuario, BindingResult br) {		
		ModelAndView retorno = new ModelAndView("index");
		if (br.hasErrors()) {
			retorno.addObject("erros", br.getFieldErrors());
		} else {
			Usuario cadastrado = usuarioService.inserirUsuario(usuario);
			String rota = "";
			switch (usuario.getTipo()) {
				case 'E':
					rota = "index";
					break;
	
				case 'C':
					rota = "index";
					break;
			}
			retorno.setViewName(rota);
			retorno.addObject("usuario", cadastrado);
		}
		return retorno;
	}
	
	//IR PARA AS TELAS, APÓS LOGAR
	@PostMapping(value = "/login")
	public ModelAndView loginTelas(String email, String senha) {
		
		ModelAndView retorno = new ModelAndView("index");
		
		if (org.apache.commons.lang3.StringUtils.isNotBlank(email) && org.apache.commons.lang3.StringUtils.isNotBlank(senha)) {        
			Usuario usuario = new Usuario();
            String rota = "index";
            try{
                usuario = usuarioService.obterPorEmail(email);
            }catch(Exception e){
            }

			if (usuario != null && senha.equals(usuario.getSenha())) {
				switch (usuario.getTipo()) {
					case 'E':
						rota = "empresa/telaEmpresa";
						break;
					case 'C':
						rota = "candidato/telaCandidato";
						break;
				}
				retorno.setViewName(rota);
				retorno.addObject("usuario", usuario);
			} else {
				retorno.addObject("erro", "Login inválido!");
			}
		} else {
			retorno.addObject("erro", "Os campos são obrigatórios");
		}	
		return retorno;
	}
	
	//VOLTANDO PARA LOGIN, APÓS ENTRAR NAS TELAS
	@GetMapping(value = "/login/autenticacaoC")
	public String voltarIndexC( ) {
		return "index";
	}
	@GetMapping(value = "/login/autenticacaoE")
	public String voltarIndexE( ) {
		return "index";
	}
		
}
