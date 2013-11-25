package br.com.karenaraujo.projetoloja.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produto {

    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String qntEstoque;
    private double valor;
    @Temporal(TemporalType.DATE)
    private Date datafabricacao;
    @ManyToOne
    private CategoriaProduto categoriaproduto;

    @Override
    public String toString() {
        return "Produto{" + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(String qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Date datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public CategoriaProduto getCategoriaproduto() {
        return categoriaproduto;
    }

    public void setCategoriaproduto(CategoriaProduto categoriaproduto) {
        this.categoriaproduto = categoriaproduto;
    }
}