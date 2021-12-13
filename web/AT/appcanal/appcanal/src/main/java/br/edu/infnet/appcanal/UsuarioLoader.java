package br.edu.infnet.appcanal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcanal.model.domain.Endereco;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Endereco endereco = new Endereco();
		endereco.setBairro("bairro");
		endereco.setCep("123123123");
		endereco.setComplemento("complemento");
		endereco.setLocalidade("localidade");
		endereco.setLogradouro("logradouro");
		endereco.setUf("GO");
		
		Usuario usuario = new Usuario();
		usuario.setEmail("simon2021@gmail.com");
		usuario.setNome("Simon Assagra");
		usuario.setSenha("777");
		usuario.setAdmin(true);
		
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);
	}
	
	
	
}
