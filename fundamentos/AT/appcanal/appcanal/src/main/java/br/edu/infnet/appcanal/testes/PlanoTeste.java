package br.edu.infnet.appcanal.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appcanal.domain.Cliente;
import br.edu.infnet.appcanal.domain.Esporte;
import br.edu.infnet.appcanal.domain.Filme;
import br.edu.infnet.appcanal.domain.Plano;
import br.edu.infnet.appcanal.domain.Serie;
import br.edu.infnet.appcanal.domain.Servico;

public class PlanoTeste {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Ana", false, 2);
		
		Filme infinito = new Filme("Prime Video", "Videogame", 39.90);
		try {
			infinito.setCategoria("Ficção");
			infinito.setTaxaAdesaoFilme(0);
			infinito.setOscar(false);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Filme coringa = new Filme("TeleCine", "TvBox", 39.90);
		try {
			coringa.setCategoria("Drama");
			coringa.setTaxaAdesaoFilme(0);
			coringa.setOscar(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Serie whatIf = new Serie("Disney+", "SmartTv", 90.00);
		try {
			whatIf.setGenero("Superaventura");
			whatIf.setTaxaAdesaoSerie(0);
			whatIf.setLancamento(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Esporte futebol = new Esporte("Globo", "Celular", 180.00);
		try {
			futebol.setTime("Copa América");
			futebol.setTaxaAdesaoEsporte(0);
			futebol.setPremiado(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<Servico> listaFilme = new ArrayList<Servico>();
		listaFilme.add(infinito);
		listaFilme.add(coringa);
		
		List<Servico> listaSerie = new ArrayList<Servico>();
		listaSerie.add(whatIf);
		
		List<Servico> listaEsporte = new ArrayList<Servico>();
		listaEsporte.add(futebol);
		
		Plano plano = new Plano();
		plano.setCliente(cliente);
		plano.setDuracaoPlano("Mensal");
		plano.setServicos(listaFilme);
		System.out.println(plano);
		
		Plano plano2 = new Plano();
		plano2.setCliente(cliente);
		plano2.setDuracaoPlano("Trimestral");
		plano2.setServicos(listaSerie);
		System.out.println(plano2);
		
		Plano plano3 = new Plano();
		plano3.setCliente(cliente);
		plano3.setDuracaoPlano("Semestral");
		plano3.setServicos(listaEsporte);
		System.out.println(plano3);

	}
}
