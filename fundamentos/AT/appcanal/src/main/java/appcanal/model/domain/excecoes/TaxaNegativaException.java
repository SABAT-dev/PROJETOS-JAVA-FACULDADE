package appcanal.model.domain.excecoes;

public class TaxaNegativaException extends Exception {
	public TaxaNegativaException(String mensagem) {
		super(mensagem);
	}
}
