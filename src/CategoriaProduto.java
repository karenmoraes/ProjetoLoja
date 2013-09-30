
import java.util.Date;


public class CategoriaProduto {
    
    private String nome;
    private int codigo;
    private String descricao;
    private int qntestoque;
    private double valor;
    private Date datacompra;

    public Date getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQntestoque() {
        return qntestoque;
    }

    public void setQntestoque(int qntestoque) {
        this.qntestoque = qntestoque;
    }
   
    
}
