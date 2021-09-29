package pessoa;

import excecoes.NomeIncompletoExcecao;
import excecoes.NumeroNomeExcecao;

public abstract class Pessoa {
    protected String nome;
    protected String nomeMeio;
    protected String ultimoNome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = new String (nomeMeio);
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public abstract void setNome(String nome) throws NomeIncompletoExcecao, NumeroNomeExcecao, NomeIncompletoExcecao;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws NumberFormatException {
        this.idade = idade;

    }

    public abstract void consultarSituacao();
}
