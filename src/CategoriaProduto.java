
import java.util.Date;





public class CategoriaProduto {
    
    private String nome;
    private int codigo;
    private String descricao;    
    private double valor;
    private Date datafabricacao;

    public Date getDatacompra() {
        return datafabricacao;
    }

    public void setDatacompra(Date datafabricacao) {
        this.datafabricacao= datafabricacao;
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

   
   
}
