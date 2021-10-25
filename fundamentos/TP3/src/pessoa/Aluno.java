package pessoa;

import excecoes.NomeIncompletoExcecao;
import excecoes.NumeroNomeExcecao;
import static tp3.ControleAcademico3.constante;

public class Aluno extends Pessoa {
    private double av1;
    private double av2;
    private double media;
    private String periodo;
    private String resultadoFinal;

    public Aluno() {

    }

    public Aluno(String nome, int idade, String periodo  ) throws NomeIncompletoExcecao, NumeroNomeExcecao {
        setNome(nome);
        this.idade = idade;
        this.periodo = periodo;
    }

    @Override
    public void setNome(String nome) throws NomeIncompletoExcecao, NumeroNomeExcecao {
        //SOMENTE ao digitar o PRIMEIRO NOME, que se executa java.lang.StringIndexOutOfBoundsException
        //NomeIncompletoException é executado em seguida
        //SE houver NÚMERO, aciona NumeroNomeExcecao
        if(nome.matches(".*\\d.*") == false){
            try {
                int inicioDelimitador =  nome.indexOf(" ");
                int ultimoDelimitador = nome.lastIndexOf(" ");
                this.nome = nome.substring(0, inicioDelimitador);
                if(inicioDelimitador != ultimoDelimitador) {
                    nomeMeio = new String(nome.substring((inicioDelimitador +1), ultimoDelimitador));
                }
                ultimoNome = nome.substring((ultimoDelimitador +1));
            }catch(StringIndexOutOfBoundsException e) {
                throw new NomeIncompletoExcecao("NOME INCOMPLETO!.");
            }
        }else {
            throw new NumeroNomeExcecao("NÚMERO PRESENTE NO NOME!.");
        }
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String turno) {
        this.periodo = turno;
    }

    public double getNota1() {
        return av1;
    }

    public void setNota1(double av1) throws NumberFormatException {
        this.av1 = av1;
    }

    public double getNota2() {
        return av2;
    }

    public void setNota2(double av2) throws NumberFormatException {
        this.av2 = av2;

    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia(double av1, double av2) {
        this.media = (av1 + av2) / constante.QUANTIDADE_NOTAS;
    }

    public String verificarResultado(double media) {
        if (media < 4) {
            resultadoFinal = "Reprovado";
        } else if (media >= 4 && media < 7) {
            resultadoFinal = "Prova Final";
        } else {
            resultadoFinal = "Aprovado";
        }
        return resultadoFinal;
    }

    @Override
    public void consultarSituacao() {
        StringBuilder nomeCompleto =  new StringBuilder();
        if(nomeMeio != null) {
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

        calcularMedia(getNota1(), getNota2());
        verificarResultado(this.media);
        System.out.printf("Nome do aluno(a): %s \n", this.nome);
        System.out.printf("Idade do aluno(a): %d \n", this.idade);
        System.out.printf("Turno: %s \n", this.periodo);
        System.out.printf("Nota da AV1: %.1f \n", this.av1);
        System.out.printf("Nota da AV2: %.1f \n", this.av2);
        System.out.printf("Média final: %.1f \n", this.media);
        System.out.printf("Resultado final: %s \n", this.resultadoFinal);
    }
}
