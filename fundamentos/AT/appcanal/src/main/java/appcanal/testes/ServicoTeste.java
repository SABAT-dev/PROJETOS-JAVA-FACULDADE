package appcanal.testes;

import appcanal.model.domain.Filme;
import appcanal.model.domain.Esporte;
import appcanal.model.domain.Serie;
import appcanal.model.domain.excecoes.TaxaMaximaException;
import appcanal.model.domain.excecoes.TaxaNegativaException;

public class ServicoTeste {
	public static void main(String[] args) {
			Filme oExorcista = new Filme("HBO", "TvBox", 39.90);
			try {
				oExorcista.setCategoria("Terror");
				oExorcista.setTaxaAdesaoFilme(0);
				oExorcista.setOscar(true);
				System.out.println(oExorcista);	
			} catch (TaxaNegativaException | TaxaMaximaException e) {
				System.out.println(e.getMessage());
			}	

			Filme seBeberNaoCase = new Filme("Star Channel", "SmartTv", 90.00);
			try {
				seBeberNaoCase.setCategoria("Comedia");
				seBeberNaoCase.setTaxaAdesaoFilme(0);
				seBeberNaoCase.setOscar(false);
				System.out.println("O preço final do filme é R$" + seBeberNaoCase.calcularPreco());
			} catch (TaxaNegativaException | TaxaMaximaException e) {
				System.out.println(e.getMessage());
			}
		
			Serie lucifer = new Serie("Fox", "Celular", 180.00);
			try {
				lucifer.setGenero("Ação");
				lucifer.setTaxaAdesaoSerie(0);
				lucifer.setLancamento(false);
				System.out.println(lucifer);
			} catch (TaxaNegativaException | TaxaMaximaException e) {
				System.out.println(e.getMessage());
			}
		
			Serie gaviaoArqueiro = new Serie("Disney+", "Computador", 360.00);
			try {
			gaviaoArqueiro.setGenero("Aventura");
			gaviaoArqueiro.setTaxaAdesaoSerie(15);
			gaviaoArqueiro.setLancamento(true);
			System.out.println("O preço final da série é R$" + gaviaoArqueiro.calcularPreco());
			} catch (TaxaNegativaException | TaxaMaximaException e) {
				System.out.println(e.getMessage());
			}
		
			Esporte basquete = new Esporte("TNT Sports", "Celular", 180.00);
			try {
			basquete.setTime("LA Clippers");
			basquete.setTaxaAdesaoEsporte(0);
			basquete.setPremiado(false);
			System.out.println(basquete);
			} catch (TaxaNegativaException | TaxaMaximaException e) {
				System.out.println(e.getMessage());
			}
		
			Esporte volei = new Esporte("TV NSports", "TvBox", 90.00);
			try {
			volei.setTime("Sada Cruzeiro Vôlei");
			volei.setTaxaAdesaoEsporte(0);
			volei.setPremiado(true);
			System.out.println("O preço final do esporte é R$" + volei.calcularPreco());
			} catch (TaxaNegativaException | TaxaMaximaException e) {
				System.out.println(e.getMessage());
			}
	}
}
