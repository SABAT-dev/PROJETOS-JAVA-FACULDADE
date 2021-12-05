package br.edu.infnet.venturaweb.domain.usuarios;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

public class Usuario {

    private Integer id;
    
    @NotBlank(message = "O campo NOME é obrigatório!")
    private String nome;
    
    @NotBlank(message = "O campo ENDEREÇO é obrigatório!")
    private String endereco;
    
    @NotBlank(message = "O campo TELEFONE é obrigatório!")
    private String telefone;
    
    @NotBlank(message = "O campo E-MAIL é obrigatório!")
    private String email;
    
    @NotBlank(message = "O campo SENHA é obrigatório!")
    private String senha;
    
    @NotBlank(message = "O campo CPF é obrigatório!")
    private String cpf;
    
    private String razaoSocial;
    private String cnpj;
    private Character tipo;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario(Integer id, String nome, String endereco, String telefone, String email, String senha, String cpf, Character tipo) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.tipo = tipo;   
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(cnpj, cpf, email, endereco, id, nome, razaoSocial, senha, telefone, tipo);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(razaoSocial, other.razaoSocial)
				&& Objects.equals(senha, other.senha) && Objects.equals(telefone, other.telefone)
				&& Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "br.edu.infnet.venturaweb.domain.usuarios.Usuario[ id=" + id + " ]";
	}
    
    
	
}
