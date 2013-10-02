package Loja;


import java.util.Date;

public class CategoriaProduto {
    
    private String nome;
    private String codigo;
    private String descricao;    
    private double valor;
    private Date datafabricacao;

    public CategoriaProduto() {
    }

   
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Date datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

   

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "CategoriaProduto{" + "nome=" + nome + ", codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", datafabricacao=" + datafabricacao + '}';
    }

   
   
}
