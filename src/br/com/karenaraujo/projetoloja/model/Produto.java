package br.com.karenaraujo.projetoloja.model;



import java.util.Date;

public class Produto extends CategoriaProduto{
    
    private String qntEstoque;
    private Date datacompra;

    @Override
    public String toString() {
        return "Produto{" + "qntEstoque=" + qntEstoque + ", datacompra=" + datacompra + '}';
    }

    public Produto(String qntEstoque, Date datacompra) {
        this.qntEstoque = qntEstoque;
        this.datacompra = datacompra;
    }

    public Date getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
    }

    public String getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(String qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
    public Produto(){
        
    }
    
}
