package pessoa;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(){
        this.nome = "Fantasma";
    }

    public Professor(String nome, int idade, String disciplina, double salario){
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
        this.salario = salario;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void consultarSituacao() {
        System.out.printf("Nome do(a) professor(a): %s \n", this.nome);
        System.out.printf("Idade do(a) professor(a): %d \n", this.idade);
        System.out.printf("Disciplina: %s \n", this.disciplina);
        System.out.printf("Salário: R$%.2f \n", this.salario);
    }
}


