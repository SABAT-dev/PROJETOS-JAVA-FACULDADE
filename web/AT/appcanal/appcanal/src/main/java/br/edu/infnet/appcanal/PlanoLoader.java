package br.edu.infnet.appcanal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcanal.model.domain.Cliente;
import br.edu.infnet.appcanal.model.domain.Esporte;
import br.edu.infnet.appcanal.model.domain.Filme;
import br.edu.infnet.appcanal.model.domain.Plano;
import br.edu.infnet.appcanal.model.domain.Serie;
import br.edu.infnet.appcanal.model.domain.Servico;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.service.PlanoService;

@Component
@Order(4)
public class PlanoLoader implements ApplicationRunner {
	
	@Autowired
	private PlanoService planoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Filme oExorcista = new Filme();		
		oExorcista.setId(1);
		
		Serie lucifer = new Serie();		
		lucifer.setId(2);
		
		Esporte basquete = new Esporte();
		basquete.setId(3);

		Cliente cliente = new Cliente();
		cliente.setId(1);
		
		List<Servico> listaServicos = new ArrayList<Servico>();
		listaServicos.add(oExorcista);
		listaServicos.add(lucifer);
		listaServicos.add(basquete);
				
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Plano plano = new Plano();
		plano.setCliente(cliente);
		plano.setDuracaoPlano("Mensal - Loader");
		plano.setServicos(listaServicos);
		plano.setUsuario(usuario);
		
		planoService.incluir(plano);
		
	}

}
