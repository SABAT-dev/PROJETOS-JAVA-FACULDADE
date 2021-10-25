package pessoa;

import excecoes.NomeIncompletoExcecao;
import excecoes.NumeroNomeExcecao;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;


    public Professor() {

    }

    public Professor(String nome, int idade, String disciplina, double salario) throws NomeIncompletoExcecao, NumeroNomeExcecao {
        setNome(nome);
        this.idade = idade;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public void setNome(String nome) throws NomeIncompletoExcecao, NumeroNomeExcecao {
        //SE o Array "separado" = 0 = nome
        //Aciona NomeIncompletoExcecao
        //"nome" = número, aciona NumeroNomeExcecao
        if(!nome.matches(".*\\d.*")){
            String[] separado = nome.split(" ");
            if(separado.length == 1) {
                throw new NomeIncompletoExcecao("NOME INCOMPLETO!.");
            }
            this.nome = separado[0];
            ultimoNome= new String(separado[separado.length - 1]);
            nomeMeio ="";
            for(int i = 1; i < separado.length - 1; i++) {
                nomeMeio += separado[i] + " ";
            }
            nomeMeio = nomeMeio.trim();
        }else {
            throw new NumeroNomeExcecao("NÚMERO PRESENTE NO NOME!.");
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws NumberFormatException {
        this.salario = salario;

    }

    @Override
    public void consultarSituacao() {

        StringBuilder nomeCompleto =  new StringBuilder();
        if(nomeMeio != "") {
            nomeCompleto.append(nome);
            nomeCompleto.append(" ");
            nomeCompleto.append(nomeMeio);
            nomeCompleto.append(" ");
            nomeCompleto.append(ultimoNome);
        }else {
            nomeCompleto.append(nome);
            nomeCompleto.append(" ");
            nomeCompleto.append(ultimoNome);

        }

        System.out.printf("Nome do(a) professor(a): %s \n", this.nome);
        System.out.printf("Idade do(a) professor(a): %d \n", this.idade);
        System.out.printf("Disciplina: %s \n", this.disciplina);
        System.out.printf("Salário: R$%.2f \n", this.salario);
    }
}
