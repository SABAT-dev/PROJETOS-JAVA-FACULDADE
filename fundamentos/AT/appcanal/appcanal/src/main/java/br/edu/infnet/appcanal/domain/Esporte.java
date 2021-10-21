package br.edu.infnet.appcanal.domain;

import br.edu.infnet.appcanal.domain.excecoes.TaxaMaximaException;
import br.edu.infnet.appcanal.domain.excecoes.TaxaNegativaException;

public class Esporte extends Servico {
	private String time;
	private double taxaAdesaoEsporte;
	private boolean premiado;
	
	public Esporte(String canal, String dispositivo, double preco) {
		super(canal, dispositivo, preco);
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getTaxaAdesaoEsporte() {
		return taxaAdesaoEsporte;
	}
	public void setTaxaAdesaoEsporte(double taxaAdesaoEsporte) throws TaxaNegativaException, TaxaMaximaException {
		if(taxaAdesaoEsporte < 0) {
			throw new TaxaNegativaException("A taxa do esporte está NEGATIVA!!!");
		} else if(taxaAdesaoEsporte > 20) {
			throw new TaxaMaximaException("A taxa MÁXIMA do esporte é 20%!!!");
		}
		this.taxaAdesaoEsporte = taxaAdesaoEsporte;
	}
	public boolean isPremiado() {
		return premiado;
	}
	
	public void setPremiado(boolean premiado) {
		this.premiado = premiado;
	}
	
	@Override
	public double calcularPreco() {
		return getPreco() + (premiado ? 8 : 0) + (taxaAdesaoEsporte / 100);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(time);
		sb.append(";");
		sb.append(taxaAdesaoEsporte);
		sb.append(";");
		sb.append(premiado ? "Premiado: sim" : "Premiado: não");
		sb.append(";");
		sb.append(calcularPreco());
		return sb.toString();
	}

}
