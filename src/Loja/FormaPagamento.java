
package Loja;

import java.util.Date;




public class FormaPagamento extends Pessoa{
    private Produto p = new Produto();
    private int compra;
    private int vezes;
    private double total;
    private double cheque;
    private double avista;
    private double cartao;

    public FormaPagamento(int compra, int vezes, double total, double cheque, double avista, double cartao, String nome, String cpf, String rg, Date datanascimento, int sexo, String telefone) {
        super(nome, cpf, rg, datanascimento, sexo, telefone);
        this.compra = compra;
        this.vezes = vezes;
        this.total = total;
        this.cheque = cheque;
        this.avista = avista;
        this.cartao = cartao;
    }

   

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCheque() {
        return cheque;
    }

    public void setCheque(double cheque) {
        this.cheque = cheque;
    }

    public double getAvista() {
        return avista;
    }

    public void setAvista(double avista) {
        this.avista = avista;
    }

    public double getCartao() {
        return cartao;
    }

    public void setCartao(double cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "p=" + p + ", compra=" + compra + ", vezes=" + vezes + ", total=" + total + ", cheque=" + cheque + ", avista=" + avista + ", cartao=" + cartao + '}';
    }

    
        
    
    
    
    
}
