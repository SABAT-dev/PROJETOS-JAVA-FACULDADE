package excecoes;

public class NomeIncompletoExcecao extends Exception {
    public NomeIncompletoExcecao(String mensagem) { // Exceção para caso não seja digitado o nome completo
        super(mensagem);
    }
}
