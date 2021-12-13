package br.edu.infnet.appcanal.model.excecoes;

public class TaxaNegativaException extends Exception {
	public TaxaNegativaException(String mensagem) {
		super(mensagem);
	}
}
