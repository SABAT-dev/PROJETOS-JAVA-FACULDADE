package br.edu.infnet.appcanal.domain;

public class Aluno {
	
	private String nome;
	private String email;
	private String escolaridade;
	private String[] disciplinas;
	private String regiao;
	private int idade;
	private float mensalidade;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public String toString() {
		return String.format("[%s] O aluno %s "
				+ "(%s) com %d anos,"
				+ " da regi�o %s "
				+ "e mensalidade de %.2f reais - "
				+ "est� inscrito em %d disciplinas!\n",
				escolaridade, nome, email, idade, regiao, mensalidade, disciplinas.length);
	}
		
	public void impressao() {
		System.out.println(this);
		System.out.println("Lista de Disciplinas:");
		
		for (String disciplina : disciplinas) {
			System.out.println("-> " + disciplina);
		}
	}
}
