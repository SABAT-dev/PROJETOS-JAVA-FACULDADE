package br.edu.infnet.appcanal.domain;

public class Cliente {
	private String nome;
	private boolean status;
	private int tela;
	
	public Cliente(String nome, boolean status, int tela) {
		this.nome = nome;
		this.status = status;
		this.tela = tela;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getTela() {
		return tela;
	}	
	public void setTela(int tela) {
		this.tela = tela;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(status ? "Ativo" : "Expirado");
		sb.append(";");
		sb.append(tela);
		
		return sb.toString();
	}
}
