package br.edu.infnet.appcanal.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servico")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String canal;
	private String dispositivo;
	private double preco;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToMany(mappedBy = "servicos")
	private List<Plano> planos;
	
	
	public Servico() {
		
	}
	
	public Servico(String canal, String dispositivo, double preco) {
		this();
		this.canal = canal;
		this.dispositivo = dispositivo;
		this.preco = preco;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Plano> getPlanos() {
		return planos;
	}

	public void setPlanos(List<Plano> planos) {
		this.planos = planos;
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