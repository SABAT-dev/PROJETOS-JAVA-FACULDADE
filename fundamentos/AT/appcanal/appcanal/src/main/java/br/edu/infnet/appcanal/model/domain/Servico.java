package br.edu.infnet.appcanal.domain;

public abstract class Servico {
	private String canal;
	private String dispositivo;
	private double preco;
	
	public Servico(String canal, String dispositivo, double preco) {
		this.canal = canal;
		this.dispositivo = dispositivo;
		this.preco = preco;
	}
	
	public String getCanal() {
		return canal;
	}
	public String getDispositivo() {
		return dispositivo;
	}
	public double getPreco() {
		return preco;
	}
	
	public abstract double calcularPreco();
	
	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append(canal);
		sb.append(";");
		sb.append(dispositivo);
		sb.append(";");
		sb.append(preco);
		
		return sb.toString();
	}
	
}