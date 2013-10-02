
package Loja;

import java.util.Date;



public class AssistenciaTecnica extends Cliente {
    private Produto p = new Produto();
    private String descricao;

    public AssistenciaTecnica(String descricao, String codigo, String email, int dependente, double salario, double limite, String nome, String cpf, String rg, Date datanascimento, int sexo, String telefone) {
        super(codigo, email, dependente, salario, limite, nome, cpf, rg, datanascimento, sexo, telefone);
        this.descricao = descricao;
    }

  

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "AssistenciaTecnica{" + "p=" + p + ", descricao=" + descricao + '}';
    }
    
   
    }
    
    

