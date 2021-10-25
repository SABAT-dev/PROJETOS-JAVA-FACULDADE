package br.edu.infnet.appcanal.domain;

import br.edu.infnet.appcanal.domain.excecoes.TaxaMaximaException;
import br.edu.infnet.appcanal.domain.excecoes.TaxaNegativaException;

public class Filme extends Servico {
	
	private String categoria;
	private double taxaAdesaoFilme;
	private boolean oscar;
	
	public Filme(String canal, String dispositivo, double preco) {
		super(canal, dispositivo, preco);
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getTaxaAdesaoFilme() {
		return taxaAdesaoFilme;
	}
	public void setTaxaAdesaoFilme(double taxaAdesaoFilme) throws TaxaNegativaException, TaxaMaximaException {
		if(taxaAdesaoFilme < 0) {
			throw new TaxaNegativaException("A taxa do filme está NEGATIVA!!!");
		} else if(taxaAdesaoFilme > 20) {
			throw new TaxaMaximaException("A taxa MÁXIMA do filme é 20%!!!");
		}
		this.taxaAdesaoFilme = taxaAdesaoFilme;
	}
	public boolean isOscar() {
		return oscar;
	}
	public void setOscar(boolean oscar){	
		this.oscar = oscar;
	}

	@Override
	public double calcularPreco() {
		return getPreco() + (oscar ? 5 : 0) + (taxaAdesaoFilme / 100);
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(categoria);
		sb.append(";");
		sb.append(taxaAdesaoFilme);
		sb.append(";");
		sb.append(oscar ? "Oscar: sim" : "Oscar: não");
		sb.append(";");
		sb.append(calcularPreco());
		return sb.toString();
	}
	
}
