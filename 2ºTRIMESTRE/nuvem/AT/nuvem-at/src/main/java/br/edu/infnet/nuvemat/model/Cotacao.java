package br.edu.infnet.nuvemat.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cotacao")
public class Cotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fornecedor")
    private String fornecedor;
    @Column(name = "preco")
    private Double preco;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cotacao cotacao = (Cotacao) o;
        return id.equals(cotacao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
