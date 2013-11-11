package br.com.karenaraujo.projetoloja.model;

import java.util.Date;

public class Produto extends CategoriaProduto {

    private String nome;
    private String qntEstoque;
    private double valor;
    private Date datafabricacao;
    private CategoriaProduto categoriaproduto;

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

    @Override
    public String toString() {
        return nome;
    }

    public Produto() {
    }

    public String nome() {
        return nome;
    }

    public void nome(String nome) {
        this.nome = nome;


    }

    public String getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(String qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
}
