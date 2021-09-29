package appcanal.model.domain;

import appcanal.model.domain.excecoes.TaxaNegativaException;
import appcanal.model.domain.excecoes.TaxaMaximaException;

public class Serie extends Servico {
	
	private String genero;
	private double taxaAdesaoSerie;
	private boolean lancamento;

	public Serie(String canal, String dispositivo, double preco) {
		super(canal, dispositivo, preco);
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getTaxaAdesaoSerie() {
		return taxaAdesaoSerie;
	}
	public void setTaxaAdesaoSerie(double taxaAdesaoSerie) throws TaxaNegativaException, TaxaMaximaException {
		if(taxaAdesaoSerie < 0) {
			throw new TaxaNegativaException("A taxa da série está NEGATIVA!!!");
		} else if(taxaAdesaoSerie > 20) {
			throw new TaxaMaximaException("A taxa MÁXIMA da série é 20%!!!");
		}
		this.taxaAdesaoSerie = taxaAdesaoSerie;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	
	@Override
	public double calcularPreco() { 
		return getPreco() + (lancamento ? 15 : 0) + (taxaAdesaoSerie / 100);
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(genero);
		sb.append(";");
		sb.append(taxaAdesaoSerie);
		sb.append(";");
		sb.append(lancamento ? "Lançamento: sim" : "Lançamento: não");
		sb.append(";");
		sb.append(calcularPreco());
		return sb.toString();
	}

}
