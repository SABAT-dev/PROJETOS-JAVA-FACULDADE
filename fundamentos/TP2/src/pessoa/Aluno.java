package pessoa;

import constantes.Constante;

public class Aluno extends Pessoa{

    Constante constante = new Constante();

    private double nota1;
    private double nota2;
    private double media;
    private String resultadofinal;
    private String periodo;

    public Aluno() {
        this.nome = "Fantasma";
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, double nota1, double nota2,
                 double media, String resultadofinal, String periodo) {
        this(nome, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.resultadofinal = resultadofinal;
        this.periodo = periodo;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getResultadofinal() {
        return resultadofinal;
    }

    public void setResultadofinal(String resultadofinal) {
        this.resultadofinal = resultadofinal;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

   public double calcularMedia(double nota1, double nota2){
        return media = (nota1 + nota2) / constante.QUANTIDADE_NOTAS;
    }

    public String verificarResultado(double media) {
        if (media < 4) {
            resultadofinal = "Reprovado";
        } else if (media >= 4 && media < 7) {
            resultadofinal = "Prova Final";
        } else {
            resultadofinal = "Aprovado";
        }
        return resultadofinal;
    }

    @Override
    public void consultarSituacao() {
        calcularMedia(getNota1(), getNota2());
        verificarResultado(this.media);
        System.out.printf("Nome do aluno(a): %s \n", this.nome);
        System.out.printf("Idade do aluno(a): %d \n", this.idade);
        System.out.printf("Turno: %s \n", this.periodo);
        System.out.printf("Nota da AV1: %.1f \n", this.nota1);
        System.out.printf("Nota da AV2: %.1f \n", this.nota2);
        System.out.printf("Média final: %.1f \n", this.media);
        System.out.printf("Resultado final: %s \n", this.resultadofinal);
    }
}