package br.edu.infnet.nuvemat.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "marca")
    private String marca;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "foto")
    private String file;
    @OneToMany (cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_produto")
    private List<Cotacao> cotacao;

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
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }
    public List<Cotacao> getCotacao() {
        return cotacao;
    }
    public void setCotacao(List<Cotacao> cotacao) {
        this.cotacao = cotacao;
    }
}
