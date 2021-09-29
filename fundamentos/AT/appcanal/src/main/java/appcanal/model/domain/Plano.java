package appcanal.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Plano {
	private LocalDateTime data;
	private Cliente cliente;
	private String duracaoPlano;
	private List<Servico> servicos;
	
	public Plano() {
		data = LocalDateTime.now();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDuracaoPlano() {
		return duracaoPlano;
	}
	public void setDuracaoPlano(String duracaoPlano) {
		this.duracaoPlano = duracaoPlano;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		StringBuilder sb = new StringBuilder();
		sb.append(data.format(dtf));
		sb.append(";");
		sb.append(duracaoPlano);
		sb.append(";");
		sb.append(cliente);
		sb.append(";");
		if(servicos != null) {
			sb.append(servicos.size());
		}
		
		return sb.toString();
	}
}

