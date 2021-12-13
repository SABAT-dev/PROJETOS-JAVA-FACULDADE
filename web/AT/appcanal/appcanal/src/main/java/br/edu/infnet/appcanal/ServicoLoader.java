package br.edu.infnet.appcanal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcanal.model.domain.Esporte;
import br.edu.infnet.appcanal.model.domain.Filme;
import br.edu.infnet.appcanal.model.domain.Serie;
import br.edu.infnet.appcanal.model.domain.Usuario;
import br.edu.infnet.appcanal.model.excecoes.TaxaMaximaException;
import br.edu.infnet.appcanal.model.excecoes.TaxaNegativaException;
import br.edu.infnet.appcanal.model.service.EsporteService;
import br.edu.infnet.appcanal.model.service.FilmeService;
import br.edu.infnet.appcanal.model.service.SerieService;

@Component
@Order(3)
public class ServicoLoader implements ApplicationRunner {

	@Autowired
	private FilmeService filmeService;
	@Autowired
	private SerieService serieService;
	@Autowired
	private EsporteService esporteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);

			Filme oExorcista = new Filme("HBO", "TvBox", 39.90);		
			oExorcista.setCategoria("Terror");
			oExorcista.setTaxaAdesaoFilme(5);
			oExorcista.setOscar(true);
			oExorcista.setUsuario(usuario);
			filmeService.incluir(oExorcista);
			
			Serie lucifer = new Serie("Fox", "Celular", 180.00);
			lucifer.setGenero("Ação");
			lucifer.setTaxaAdesaoSerie(20);
			lucifer.setLancamento(false);
			lucifer.setUsuario(usuario);
			serieService.incluir(lucifer);
			
			Esporte basquete = new Esporte("TNT Sports", "Celular", 180.00);
			basquete.setTime("LA Clippers");
			basquete.setTaxaAdesaoEsporte(10);
			basquete.setPremiado(false);
			basquete.setUsuario(usuario);
			esporteService.incluir(basquete);

		} catch (TaxaNegativaException | TaxaMaximaException e) {
			System.out.println(e.getMessage());
		}
	}

}
