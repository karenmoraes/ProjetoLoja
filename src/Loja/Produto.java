package Loja;



import java.util.Date;

public class Produto extends CategoriaProduto{
    
    private String qntEstoque;
    private Date datacompra;

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
