package br.edu.infnet.cadastroservice.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USUARIOWEB")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "EMAIL", unique = true)
    private String email;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "CEP")
    private String cep;
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Usuario usuario = (Usuario) o;
        return id.equals(usuario.id) && nome.equals(usuario.nome) && email.equals(usuario.email) && telefone.equals(usuario.telefone) && cep.equals(usuario.cep) && endereco.equals(usuario.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, nome, email, telefone, cep, endereco);
    }
}
