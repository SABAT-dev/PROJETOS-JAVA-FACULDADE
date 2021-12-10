package br.edu.infnet.nuvemtp3.model;

import br.edu.infnet.nuvemtp3.service.dto.DtoEndereco;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Integer id;
	@Column (name = "cep")
	private String cep;
	@Column (name = "logradouro")
	private String logradouro;
	@Column (name = "complemento")
	private String complemento;
	@Column (name = "numero")
	private String numero;
	@Column (name = "bairro")
	private String bairro;
	@Column (name = "localidade")
	private String localidade;
	@Column (name = "uf")
	private String uf;
	
	
	public void copyFrom(DtoEndereco dtoEndereco){
		cep = dtoEndereco.getCep();
		logradouro = dtoEndereco.getLogradouro();
		bairro = dtoEndereco.getBairro();
		localidade = dtoEndereco.getLocalidade();
		uf = dtoEndereco.getUf();
		}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
}
